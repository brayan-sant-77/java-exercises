package brayan.poo.Exercice01.domain;

import brayan.poo.Exercice01.exceptions.QuantityInvalid;

public class Product {
   private String name;
   private double price;
   private int quantityInStock;

   public Product(String name, double price, int quantityInStock) {
      if (price <= 0) {
         throw new IllegalArgumentException("The price of the product must be higher than the value reported");
      }
      if (quantityInStock < 0) {
         throw new IllegalArgumentException("The quantity in stock may not be less than zero");
      }
      if (name == null || name.trim().isEmpty()) {
         throw new IllegalArgumentException("Product name cannot be null or empty");
      }

      this.name = name;
      this.price = price;
      this.quantityInStock = quantityInStock;

   }

   @Override
   public String toString() {
      return "Product{" +
              "name='" + name + '\'' +
              ", price=" + price +
              ", quantityInStock=" + quantityInStock +
              '}';
   }

   public void addInStock(int addProduct) {
      if (addProduct <= 0) {
         throw new QuantityInvalid("Cannot add null or negative values!");
      }
      quantityInStock += addProduct;
   }

   public void removeInStock(int removeProduct) {
      if (removeProduct <= 0 || removeProduct > quantityInStock) {
         throw new QuantityInvalid("Invalid value!");
      }
      quantityInStock -= removeProduct;
   }

   public double calculateTotalValueInStock() {
      return price * quantityInStock;
   }

   // getters
   public String getName() {
      return name;
   }

   public double getPrice() {
      return price;
   }

   public int getQuantityInStock() {
      return quantityInStock;
   }

}
