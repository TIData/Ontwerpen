package domein;

public class StockService {

    private Stock stock = new Stock();

    public String insert(String productName, int quantity) {
        stock.insert(productName, quantity);
        //DATABASE : code to create product in stock
        //LOG : code to log creation
        return String.format("DATABASE : product in stock created%s"
                + // simulate inserting in the database 
                "LOG: stock created for product %s and quantity %d%s",// simulate logging
                System.lineSeparator(), productName, quantity, System.lineSeparator());
    }

    public String update(String productName, int quantity) {
        int oldQuantity = stock.getQuantity(productName);
        stock.update(productName, quantity);
        //DATABASE : code to update quantity product in stock
        //LOG : code to log update
        return String.format("DATABASE: Updated quantity for product %s%s"
                + // simulate updating a database 
                "LOG: Updated stock quantity from %d to %d%s",// simulate logging
                productName, System.lineSeparator(), oldQuantity, quantity, System.lineSeparator());
    }

    public String ship(String productName) {
        stock.ship(productName);
        //DATABASE : code to update quantity product in stock
        //LOG : code to log shipment
        return String.format("DATABASE : Product %s is now shipped%s"
                + // simulate inserting in the database 
                "LOG: Product %s has been shipped%s",// simulate logging
                productName, System.lineSeparator(), productName, System.lineSeparator());
    }

    public String productenView() {
        return stock.productenView();
    }
}
