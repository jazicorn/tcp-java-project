# Planning

## Section A:
Store a minimum and a maximum number of items of the product that can be displayed on the shelf. As
soon as the system notices that it has reached the threshold number/weight, it is going to send a
notification to replenish the items and store this information in database with timestamp.
For example:

Keywords: Store, Minimum, Maximum, Number of Items, Product, Shelf, Inventory, Notifications, Replenishment, Database, Timestamp

Ideas: Inventory vs. Shelf, Iventory System vs Replenishment System

Systems: Inventory System, Replinshment System, Notification System

### Project TODO: Console 
**Information:**
- Start: 09/11/23
- End: ?
- Finished: ❌ 

Create console for user interface and to display project information.

### Section A TODO: Create Product
**Information:**
- Start: 09/11/23
- End: ?
- Finished: ❌

#### createProduct: ProductID, ProductName, ExpiryDate, TimeDurationForMarkDown.

**All of the arguments are mandatory:**
1. Creates a product and stores in database.
2. The ProductID must be unique. If we try to create with a non-unique ProductID, display a message “ProductName should have a uniqueID, the ProductName already exists with the same uniqueID”.
3. If the system creates the product successfully, display, “ProductName with the ProductID created successfully".
4. If the createProduct command is called without parameters, display a helpful message that productID and ProductName are required. And that other arguments take default values.
5. Default values,
    a. ExpiryDate: 3 months from the day of entry.
    b. TimeDurationForMarkDown: 6 days before the ExpiryDate.
6. Log any other exceptions and display a helpful error message.
