/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package za.ac.tut.model.entity.business;

import java.util.ArrayList;
import za.ac.tut.model.entity.Item;
import za.ac.tut.model.entity.Person;
import za.ac.tut.model.entity.Product;

/**
 *
 * @author LAB0040PC050
 */
public class Utility {
    
    public static ArrayList<Product> products;
    private ArrayList<Item> cart;
    private String firstname;
    private String surname;
    private String cellphone;
    private String address;

    public Utility() {
   
        products=new ArrayList<>();
        
        products.add(new Product(100L,"Chihuahua", 560.00D, "images/chihuahua.jpg"));
        products.add(new Product(200L, "sheperds", 1120.00D, "images/1449694992_9579_9541.newpng.jpg"));
        products.add(new Product(300L, "bulldogs", 2120.00D, "images/Bulldog_SERP.jpg"));
        products.add(new Product(400L, "greyhounds", 980.00D, "images/greyhound-07.jpg"));
        
        cart=new ArrayList<>();
    }
    
    public static ArrayList<Product> getProduct()
    {
        return products;
    }
    public Person getThePerson()
    {
        return new Person(firstname,surname,cellphone,address);
    }
    /*public static ArrayList<Product> getChihuahua()
    {
        products.add(new Product(100L,"Chihuahua", 560.00D, "images/chihuahua.jpg"));
        products.add(new Product(101L,"Chihuahua", 450.00D, "images/service-dogs-S0E4K8.jpg"));
        products.add(new Product(102L,"Chihuahua", 350.00D, "images/dog-on-tennis-center-service-line-by-net-looking-off-to-his-left-cocker-EWR3RR.jpg"));
        
        return products;
    }
  public static ArrayList<Product> getSherperds()
    {
        products.add(new Product(100L,"German Sherperd", 800.00D, "images/1449694992_9579_9541.newpng.jpg"));
        products.add(new Product(101L,"German Sherperd", 950.00D, "images/laying-1.jpg"));
        products.add(new Product(102L,"German Sherperd", 750.00D, "images/German-Shepherd-Training-Photo.jpg"));
        
        return products;
    }
  public static ArrayList<Product> getBulldog()
    {
        products.add(new Product(100L,"Bulldog", 980.00D, "images/Bulldog_SERP.jpg"));
        products.add(new Product(101L,"Bulldog", 895.00D, "images/bulldog-skateboarding.jpg"));
        products.add(new Product(102L,"Bulldog", 789.00D, "images/pitbull-dog-breed.jpg"));
        
        return products;
    }
  public static ArrayList<Product> getGreyhound()
    {
        products.add(new Product(100L,"Greyhound", 5120.00D, "images/greyhound-07.jpg"));
        products.add(new Product(101L,"Greyhound", 965.00D, "images/greyhound3.jpg"));
        products.add(new Product(102L,"Greyhound", 2355.00D, "images/Greyhound-5-645mk062411.jpg"));
        
        return products;
    }*/

    public static void setProducts(ArrayList<Product> products) {
        Utility.products = products;
    }
    
    public ArrayList<Item> getCart() {
        return cart;
    }
   
    public void setCart(ArrayList<Item> cart) {
        this.cart = cart;
    }

    public Person getPerson(Person p)
    {
        
        return new Person(p.getFirstname(),p.getSurname(),p.getAddress(),p.getCellphone());
    }
    
    public static double getTotalPrice(ArrayList<Item> shoppingCart) {
        double price = 0.0;
        
        for(int x = 0; x < shoppingCart.size(); x++){
            int quantity = shoppingCart.get(x).getQty();
            double ItemPrice = shoppingCart.get(x).getProduct().getPrice();
            
            double productTotal = quantity * ItemPrice;
            price += productTotal;
        }
        
        return price;
    }
}
