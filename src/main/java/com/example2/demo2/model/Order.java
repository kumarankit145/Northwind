package com.example2.demo2.model;

import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

import java.util.Date;

@Entity
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    private Long customerId;
    private Long employeeId;
    private Date orderDate;

    private Date requiredDate;
    private Date shippedDate;
    private String shipVia;
    private Double freight;
    private String shipName;
    private String shipAddress;
    private String shipCity;
    private String shipRegion;
    private String shipPostalCode;
    private String shipCountry;

    @OneToOne(mappedBy = "order")
    private OrderDetails orderDetails;

}
