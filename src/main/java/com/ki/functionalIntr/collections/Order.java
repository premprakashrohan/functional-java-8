package com.ki.functionalIntr.collections;

import java.time.LocalDate;
import java.util.Set;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
public class Order {
//  @Id
//  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  
  private LocalDate orderDate;
  private LocalDate deliveryDate;
  private String status;
  
//  @ManyToOne
//  @JoinColumn(name = "customer_id")
  private Customer customer;
  
//  @ManyToMany
//  @JoinTable(
//      name = "order_product_relationship",
//      joinColumns = { @JoinColumn(name = "order_id") },
//      inverseJoinColumns = { @JoinColumn(name = "product_id") }
//  )
  @ToString.Exclude
  Set<Product> products;
    
}