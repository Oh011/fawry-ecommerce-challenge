# Fawry Internship E-Commerce Challenge

This is a Java-based console application for the Fawry Full Stack Development Internship Challenge.

## Features

- Add products to cart with quantity checks
- Expirable and shippable products
- Shipping service & weight calculation
- Custom exception handling
- Checkout logic with subtotal, shipping fees, and final amount
- Edge case test coverage in `Main.java`

### ✅ Sample Output

---------------------------------------------------
- 2 x Cheese added to cart.
- 1 x TV added to cart.
- 1 x Scratch Card added to cart.
---------------------------------------------------
- ** Shipment notice **
- 2 X Cheese , weight : 400.0 g
- 1 X TV , weight : 2.5 kg
- Total package weight : 2.9 kg
-----------------------------------------------------
- ** Checkout receipt **
- item : Cheese , Quantity :2 , price : 100.0 , total : 200.0
- item : TV , Quantity :1 , price : 200.0 , total : 200.0
- item : Scratch Card , Quantity :1 , price : 50.0 , total : 50.0
----------------------------------------------------------
- Subtotal : 450.0
- Shipping : 30.0
- Total : 480.0
- Customer balance : 520.0

 

 Test Case 2: Empty Cart 
---------------------------------------------------  

- ERROR: Cart is empty.


---------------------------------------------------  

 
 Test Case 3: Insufficient Balance 
---------------------------------------------------  
- 1 x TV added to cart.  

- ERROR: Insufficient balance. Current: 100.0, Required: 530.0  

---------------------------------------------------  

 
 Test Case 4: Expired Product 
---------------------------------------------------  
- 1 x Yogurt added to cart.  
 
- ERROR: Product is expired: Yogurt  

---------------------------------------------------  


 Test Case 5: Out of Stock Product 
---------------------------------------------------  
- ERROR: Product out of stock: Laptop

---------------------------------------------------  

---------------------------------------------------
- 2 x Cheese added to cart.
- 2 x Yogurt added to cart.
- 1 x TV added to cart.
- 1 x Fan added to cart.
- 2 x Scratch Card added to cart.
- 1 x E-Book added to cart.
---------------------------------------------------
- ** Shipment notice **
- 2 X Cheese , weight : 400.0 g
- 2 X Yogurt , weight : 300.0 g
- 1 X TV , weight : 2.5 kg
- 1 X Fan , weight : 1.2 kg
- Total package weight : 4.4 kg
-----------------------------------------------------
- ** Checkout receipt **
- item : Cheese , Quantity :2 , price : 100.0 , total : 200.0
- item : Yogurt , Quantity :2 , price : 50.0 , total : 100.0
- item : TV , Quantity :1 , price : 200.0 , total : 200.0
- item : Fan , Quantity :1 , price : 120.0 , total : 120.0
- item : Scratch Card , Quantity :2 , price : 50.0 , total : 100.0
- item : E-Book , Quantity :1 , price : 80.0 , total : 80.0
----------------------------------------------------------
- Subtotal : 800.0
- Shipping : 30.0
- Total : 830.0
- Customer balance : 1170.0

