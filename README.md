# Ecommerce Rest API Application


## Built With
* `Java 17`
* `Maven 4.0.0`
* `MySql Ver 8.0.32`
* `Spring Boot 3.0.5`
* `IntelliJ IDEA 2023.1 (Community Edition)`

## Data Flow

### 1. Model:
* It consists of **User** ,**Address**, **Product** and **Order** entity classes along with their data members and member functions
* Used **_@Table_** and **_@Entity_** annotations inside the entity class.
* Used Lombok to reduce boilerplate code for pojo class.By using Lombok annotations like _**@Data,**_ **@_NoArgsConstructor_**, **_@AllArgsConstructor_** getters and setters for those object generate automatically.
* Used _**@OneToOne**_ annotation to perform one to one mapping between Employee and Address.

### 2. Controller:
* It consists of  **UserController** ,**AddressController**, **ProductController** and **OrderController** classes in which used the annotations like **@RestController** to annotate the class as Controller.
* Used annotation **_@GetMapping_** , **_@PostMapping_** , **_@PutMapping_** , **_@DeleteMapping_** to map the HTTP web requests to the specific handler methods.

<br>

### API Reference:
<br>

>User's API References
<br>

* Add Users:
```*.sh-session
  http://localhost:8080/user/
```

* Get all User:
```*.sh-session
  http://localhost:8080/user/
```

* Get User By ID:
```*.sh-session
  http://localhost:8080/user/{userId}
```

<br>

>Address's API References:
<br>

* Add Address:
```*.sh-session
  http://localhost:8080/address/
```

* Get all Addresses:
```*.sh-session
  http://localhost:8080/address/
```

* Get Address By ID:
```*.sh-session
  http://localhost:8080/address/{addressId}
```

<br>

>Product's API References:
<br>

* Add Product:
```*.sh-session
  http://localhost:8080/products/
```

* Get all Products:
```*.sh-session
  http://localhost:8080/products/
```

* Get Product By Category:
```*.sh-session
  http://localhost:8080/products/category/{category}
```

* Delete Product By ID:
```*.sh-session
  http://localhost:8080/products/{productId}
```

<br>

>Order's API References:
<br>

* Add Order:
```*.sh-session
  http://localhost:8080/orders/
```

* Get all Orders:
```*.sh-session
  http://localhost:8080/orders/
```

* Get Order By ID:
```*.sh-session
  http://localhost:8080/orders/{orderId}
```
<br>

### 3. Service:
* It consists of **UserService** ,**AddressService**, **ProductService** and **OrderService** classes in which provide some business functionalities of every handler methods.
* Used _**@Service**_ annotation to indicate that a class belongs to the service layer.
* Used **_@Transactional_** annotation to separate transaction management code from the code for business logic on the update and delete methods.

### 4. Repository:
* It consists of **UserDao** ,**AddressDao**, **ProductDao** and **OrderDao** interface classes that extends CrudRepository which is interface for generic inbuilt CRUD operations on a repository for a specific type. Usually represent the database access layer in an application.
* Used **Iterable** for Employee and Address to manage the data of entity classes by performing CRUD operations.
* Used _**@Repository**_ annotation is used to indicate that the class provides the mechanism for storage, retrieval, search, update and delete operation on objects.
* Used _**@Modifying**_ annotation wrote named parameters query using @Query annotation to insert, update, or delete an entity.

## Data Structure Used
Used `Iterable<T>` to store objects for entity classes.

## Project Summary
* In this project I performed CRUD operation like add,get,delete and update.<br/>
* The aim of this project to perform _**one to one**_ mapping between entity classes.
* Used interface CrudRepository class for generic CRUD inbuilt operations like save,saveAll,updateById, etc.
* Used our own custom finder methods and wrote operations using custom queries.
