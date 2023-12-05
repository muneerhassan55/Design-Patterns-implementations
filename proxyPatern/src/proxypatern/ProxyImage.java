/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proxypatern;

/**
 *
 * @author Muneer Hasan
 */
public class ProxyImage implements Image{
   private String filename;
    private int fileSize;
    private String code;
    private RealImage realImage;

    public ProxyImage(String filename, int fileSize, String code) {
        this.filename = filename;
        this.fileSize = fileSize;
        this.code = code;
    }

   @Override
    public void display(String code) {
        if (realImage == null) {
            realImage = new RealImage(filename, fileSize, this.code);
        }
        realImage.display(code);
    }
   }

