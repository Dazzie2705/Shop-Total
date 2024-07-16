/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.billqua;
import java.util.Scanner;
/**
 *
 * @author Dazte
 */
public class BillQua {

   public static void main(String[] args) {
        System.out.println("Hello World!!!");
        
        Scanner sc = new Scanner (System.in);
        System.out.println("Your name ?");
        String name = sc.nextLine();
                
        System.out.println("So luong san pham: ");
        int Quantity = Integer.parseInt(sc.nextLine());
        
        int Price = 2035;
       
        int Gifts = Quantity / 5;
        
        int Discount = Quantity % 5;
        
        float Total = (float) ((float)Math.round( Quantity * Price ) - (Discount * Price * 0.02));
        
        System.out.println("Hello Khach Hang " + name + ", You have bought: " + Quantity + " Products" + " along with : " + Gifts + " Gifts, " + Discount + "% discount" + ". With a total of: " + Total + "VNDD" );
    }
}
