# Fawry Internship E-Commerce Challenge

This is a Java-based console application for the Fawry Full Stack Development Internship Challenge.

## Features

- Add products to cart with quantity checks
- Expirable and shippable products
- Shipping service & weight calculation
- Custom exception handling
- Checkout logic with subtotal, shipping fees, and final amount
- Edge case test coverage in `Main.java`

## Sample Output

===== Test Case 1: No errors =====
---------------------------------------------------
2 x Cheese added to cart.
1 x TV added to cart.
1 x Scratch Card added to cart.
---------------------------------------------------
** Shipment notice **
Product: Cheese, Price: 100.0, Quantity: 5 , weight : 400.0 g
Product: TV, Price: 200.0, Quantity: 2 , weight : 2.5 kg
Total package weight : 2.9g
-----------------------------------------------------
** Checkout receipt **
Product: Cheese, Price: 100.0, Quantity: 5
Product: TV, Price: 200.0, Quantity: 2
Product: Scratch Card, Price: 50.0, Quantity: 10
----------------------------------------------------------
Subtotal : 450.0
Shipping : 30.0
Total :480.0
Customer balance :520.0

===================================================================
===== Test Case 2: Empty Cart =====
---------------------------------------------------
---------------------------------------------------
ERROR: Cart is empty.

===================================================================
===== Test Case 3: Insufficient Balance =====
---------------------------------------------------
1 x TV added to cart.
---------------------------------------------------
ERROR: Insufficient balance. Current: 100.0, Required: 530.0

===================================================================
===== Test Case 4 : Expired Product =====
---------------------------------------------------
1 x Yogurt added to cart.
---------------------------------------------------
ERROR: Product is expired: Yogurt

===================================================================
===== Test Case : Out of Stock Product =====
---------------------------------------------------
ERROR: Product out of stock: Laptop

===================================================================
