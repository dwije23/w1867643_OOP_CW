/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package coursework2023;

import java.util.ArrayList;
import java.util.List;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WestminsterShoppingManagerTest {
    public ArrayList<Product> productlist;

    @Test
    public void testEmptyList() {

        WestminsterShoppingManager manager2 = new WestminsterShoppingManager();
        assertEquals(0, manager2.getProductList().size());
        System.out.println("Initial list should be empty");

    }
    @Test
    public void testAddProduct() {
        ArrayList<Product> productlist = new ArrayList<>();
        Electronics electronic1 = new Electronics("A001", "Tv", 5, 12000.00, "Electronics", "HP", 12);
        Clothing clothing1 = new Clothing("B001","Shirt",10,1200.00,"Clothing","S","red");
        productlist.add(electronic1);

        assertEquals(1, productlist.size());
        assertEquals("Tv", productlist.get(0).getProductName());
        assertEquals(12000.00,productlist.get(0).getPrice());
        productlist.add(clothing1);
        assertEquals(2,productlist.size());
        assertEquals("Shirt",productlist.get(1).getProductName());
        assertEquals(1200.00,productlist.get(1).getPrice());

    }

    @Test
    public void testDeleteProduct(){
        ArrayList<Product> productlist = new ArrayList<>();
        Electronics electronic1 = new Electronics("A001", "Tv", 5, 12000.00, "Electronics", "HP", 12);
        Clothing clothing1= new Clothing("B001","Shirt",10,1200.00,"Clothing","S","red");
        productlist.add(electronic1);
        productlist.add(clothing1);

        if(electronic1.getProductId().equals("A001")){
            productlist.remove(electronic1);
            assertEquals(1,productlist.size());

        } else if(clothing1.getProductId().equals("B001")) {
            productlist.remove(clothing1);
            assertEquals(0,productlist.size());

        }

    }
    @Test
    public void testPrintProduct() {
        ArrayList<Product> productlist = new ArrayList<>();
        Electronics e1 = new Electronics("A001", "Tv", 5, 12000.00, "Electronics", "HP", 12);
        productlist.add(e1);

        assertEquals("[Product Id: A001] [Product Name: Tv] [Available Items: 5] [Price is: 12000.0] [Category is: Electronics][Brand is: HP] [Warrenty Period is: 12]",productlist.get(0).toString());

    }

    @Test 
    public void testLoadData(){

    
    }
    
}





    
    