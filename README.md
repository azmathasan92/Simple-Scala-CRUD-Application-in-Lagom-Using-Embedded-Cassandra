# Simple-Scala-CRUD-Application-in-Lagom-Using-Embedded-Cassandra

# Simple Lagom Scala CRUD

In this lagom application, we used embedded Cassandra to store the data and persistence entity to store the events.


We created only one microservice in this project which is ProductService which contains two methods:

 1. addProduct(product:Product)
 
 2. getProduct(id:String)

addProduct(product: Product) method is used to add the product to the embedded Cassandra and getProduct(id: String) method is used to retrieve the particular product from the id.

# Steps to run the Project:

 1. Clone the project:
	
        $git clone https://github.com/azmathasan92/Simple-Scala-CRUD-Application-in-Lagom-Using-Embedded-Cassandra.git


 2. Go to the Project folder:

        $cd Simple-Scala-CRUD-Application-in-Lagom-Using-Embedded-Cassandra


 3. Run the Lagom Project:

        $sbt runAll

It will take some time to run the servers ...

Once the server is started you can add the product in the Cassandra database.

# Adding a product into the application:
  This is the POST request route to add the product
  
    https://localhost:9000/products/add/product
   
   you can hit this url from the POSTMAN POST request and give the header :
   
         HEADER: Content-Type = application/json
	 
   and add the product data in the body section in JSON format :
    
    {
	"id":"1",
	"name":"azmat"
    }

# Getting the product with their product id:

// get the product with their id, you must specify the id in this URL on :id place

      https://localhost:9000/products/get/product/:id


# You can also download the POSTMAN Collection file of the Get and Post request to run directly from the POSTMAN

    https://gist.github.com/azmathasan92/6483dc1a9ba390b0c04e50c0c818b2db#file-postman-collection-json
   
    //you simply download the collection file from the above link and then import the file from the POSTMAN and run the requests

Now you have created a successful insert and retrieve application on lagom framework using embedded Cassandra 
