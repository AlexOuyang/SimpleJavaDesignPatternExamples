/**
 * Name: Alex Chenxing Ouyang
 * PID: A12067610
 * A wrapper class that uses Fascade pattern to incorporate the process
 * of ordering behind a simpler interface via the OrderFascade.
 *
 * To Compile: javac *.java
 * Run: java OrderFascade
 *
 */

class OrderFascade {

  class Time {}
  class ServiceClass {}
  class ShipperDetails {}
  class CustomerID {}
  class ProductID {}

  // Used to delegate tasks to subsystems CustomerRecordService, InventoryService, FulfillmentService
  private CustomerRecordService customerRecord;
  private InventoryService inventory;
  private FulfillmentService fulfillment;

  // Constructor takes in an array of shipperDetails as input
  public OrderFascade (FulfillmentService.ShipperDetails[] sd) {
    customerRecord = new CustomerRecordService();
    inventory = new InventoryService();
    fulfillment = new FulfillmentService(sd);
  }

  // Access an instance of CustomerRecordService
  public CustomerRecordService getCustomerRecordService() {
    return customerRecord;
  }

  // Access an instance of InventoryService
  public InventoryService getInventoryService() {
    return inventory;
  }

  // Access an instance of FulfillmentService
  public FulfillmentService getFulfillmentService() {
    return fulfillment;
  }

  // To access ShipperDetails and create an object from it to pass into the 
  // constructor of OrderFascade, an object of X class (outer class) and then 
  // use objX.new InnerClass() syntax to create an object of Y class.
  public FulfillmentService.ShipperDetails createShipperDetails() {
    return fulfillment.new ShipperDetails();
  }

  // A wrapper function that deletes to the recordOrder in CustomerRecordService
  public void recordOrder (CustomerRecordService.Time t,
                           CustomerRecordService.ServiceClass sc,
                           CustomerRecordService.CustomerID cid,
                           CustomerRecordService.ProductID pid) {
    System.out.println("Calling subsystem CustomerRecordService.recordOrder() in OrderFascade.recordOrder()");
    customerRecord.recordOrder(t, sc, cid, pid);
  }

  // A wrapper function that deletes to the fulfill in FulfillmentService
  public boolean fulfill (FulfillmentService.Time eta,
                          FulfillmentService.ServiceClass sc,
                          FulfillmentService.CustomerID cid,
                          FulfillmentService.ProductID pid) {
    System.out.println("Calling subsystem CustomerRecordService.fulfill() in OrderFascade.fulfill()");

    return fulfillment.fulfill(pid, cid, sc, eta);
  }

  // A wrapper function that deletes to the sellFromInventory in InventoryService
  public boolean sellFromInventory(InventoryService.ProductID pid) {
    System.out.println("Calling subsystem InventoryService.sellFromInventory() in OrderFascade.sellFromInventory()");
    return inventory.sellFromInventory(pid);
  }


  public static void main(String[] args) {

    System.out.println("\n\n\n");

    // Create an array of shipperDeatials to passinto OrderFascade constructor
    FulfillmentService.ShipperDetails[] shipperDetails = new FulfillmentService.ShipperDetails[2];

    // Create an order object for ordering
    OrderFascade order = new OrderFascade(shipperDetails);

    // Populate the shipperDetails array
    shipperDetails[0] = order.createShipperDetails();
    shipperDetails[1] = order.createShipperDetails();

    // Subsystem function callings
    order.recordOrder(order.getCustomerRecordService().new Time(),
                      order.getCustomerRecordService().new ServiceClass(),
                      order.getCustomerRecordService().new CustomerID(),
                      order.getCustomerRecordService().new ProductID());

    order.fulfill(order.getFulfillmentService().new Time(),
                  order.getFulfillmentService().new ServiceClass(),
                  order.getFulfillmentService().new CustomerID(),
                  order.getFulfillmentService().new ProductID());

    order.sellFromInventory(order.getInventoryService().new ProductID());


    System.out.println("\n\n\n");

  }
}
