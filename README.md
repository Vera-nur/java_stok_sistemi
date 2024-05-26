# java_stok_sistemi
Introduction
This project is a system developed to optimize stock management, product management, and sales operations. The project consists of a total of 13 frames and 6 classes. There are two types of user profiles: manager and staff. Separate interfaces and functions are provided for each user profile, allowing users to manage stock, products, and sales operations effectively.

1. User Interfaces
1.1 Manager Interface

Managers can log in as managers and access advanced management features. These features provide full control over the system's overall management and users.

1.2 Staff Interface

Staff users can log in as staff and perform stock operations. Staff can only perform actions within the permissions assigned to them in the system.

2. Staff Operations
After completing the staff login process, the stock screen opens. On the stock screen, staff can perform the following operations:

2.1 Adding Stock

New stock can be easily added by staff. This operation updates the stock quantities of products.

2.2 Viewing Total Stock

The total of current stocks can be viewed by users. This feature allows for real-time monitoring of stock status.

2.3 Searching from the Stock List

A search can be made in the stock list by product name. This feature allows for quick checking of the stock status of the desired product.

On the stock screen, there are also two main tabs: "Products" and "Sales."

2.2.1 Products Tab

Adding Products: New products can be added.
Editing Products: Existing products can be edited.
Product Table: Products can be selected from the listed table and deleted, and a search can be made by product name.
2.2.2 Sales Tab

Sales by Product ID: Sales operations can be performed based on product ID in quantities.
Reducing Stock by Date: Stock can be reduced based on the seen date.
Warning Messages: If the total stock quantity falls below 5 after sales, a warning message is written to the file. This warning message is displayed in the manager's notification section.
3. Manager Operations
The manager screen contains Internal Frames and a menu bar at the top. The following operations can be performed on the manager screen:

3.1 Adding Brands and Categories

New brands and categories can be added. These operations allow for a more organized classification of products.

3.2 Notifications

Warning notifications written to the file can be viewed by the manager. These notifications help prevent potential errors in stock management.

3.3 Staff Operations

Listing of staff, deleting the selected staff, and changing the attribute selected from the combobox with a new attribute. Also, adding new staff can be performed.

3.4 Monthly Sales

The list of products sold that month can be viewed. This feature allows monitoring of sales performance.

3.5 Listing Operations

Products, brands, and categories can be listed. This feature allows for organized tracking of all data in the system.

3.6 Stock Entries

The number of stocks each staff member has viewed that month is displayed in a table. This operation allows monitoring of staff performance.

4. Challenges Encountered
I had difficulties linking the tables in the database. If I had a more detailed SQL knowledge, some codes could have been more quality and optimal.

5. Improvement Suggestions
The interface can be made more design-oriented. Improvements can be made based on user feedback.

6. Conclusion
This stock tracking system allows users to easily manage stock, product, and sales operations. Having separate interfaces and functions for managers and staff makes the system more efficient and organized. The system's warning and notification features help prevent potential errors in stock management. This system contributes to optimizing stock management in businesses, leading to more efficient and profitable operations.
