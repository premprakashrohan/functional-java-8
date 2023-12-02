package com.ki.functionalIntr.collections;

import java.util.Set;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.With;

@Data
@NoArgsConstructor
//@Entity
public class Product {
//  @Id
//  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  
  private String name;
  private String category;
  //@With 
  private Double price;
  
 // @ManyToMany(mappedBy = "products")
  @ToString.Exclude
  private Set<Order> orders;
}