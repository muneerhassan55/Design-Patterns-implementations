/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proxypatern;

/**
 *
 * @author Muneer Hasan
 */
public class ProxyPatern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creating a real image
        String realImageFilename = "example.jpg";
        int realImageFileSize = 1024;  // in bytes
        String realImageCode = "secure123";

        // Creating a proxy image
        ProxyImage proxyImage = new ProxyImage(realImageFilename, realImageFileSize, realImageCode);

        // Displaying the proxy image with the correct code
        proxyImage.display("secure123");  // This will display real image details

        // Displaying the proxy image with the incorrect code
        proxyImage.display("wrongcode");  // This will deny access
  
    }
    
}
