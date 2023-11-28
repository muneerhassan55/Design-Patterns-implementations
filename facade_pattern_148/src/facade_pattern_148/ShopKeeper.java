/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facade_pattern_148;

/**
 *
 * @author Muneer Hasan
 */
public class ShopKeeper {
     private MobileShop iphone;  
    private MobileShop samsung;  
    
      
    public ShopKeeper(){  
        iphone= new Iphone();  
        samsung=new Samsung();  
         
    }  
    public void iphoneSale(){  
        iphone.modelNo();  
        iphone.price();  
    }  
        public void samsungSale(){  
        samsung.modelNo();  
        samsung.price();  
    }  
  

}
