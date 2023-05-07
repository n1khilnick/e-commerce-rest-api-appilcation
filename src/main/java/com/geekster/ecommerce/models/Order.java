package com.geekster.ecommerce.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "orders")
@Entity
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer orderId;

    private Integer productQuantity;

    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "fk-user_user_Id")
    private User user;

    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "fk-product_product_id")
    private Product product;

    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "fk-address_address_id")
    private Address address;
}
