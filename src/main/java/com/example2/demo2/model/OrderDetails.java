package com.example2.demo2.model;

import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

@Entity
public class OrderDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long productId;
    private Double unitPrice;
    private Integer quantity;
    private Double discount;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "order-details_id")
    private Order order;

    // Getters and Setters
}

