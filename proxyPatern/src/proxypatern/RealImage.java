/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proxypatern;

/**
 *
 * @author Muneer Hasan
 */
public class RealImage implements Image{
      private String filename;
    private int fileSize;
    private String code;

    public RealImage(String filename, int fileSize, String code) {
        this.filename = filename;
        this.fileSize = fileSize;
        this.code = code;
    }

      @Override
    public void display(String code) {
        if (this.code.equals(code)) {
            System.out.println("Displaying real image: " + filename);
            System.out.println("Details: File size - " + fileSize + " bytes");
        } else {
            System.out.println("Invalid code. Access denied.");
        }
    }
}
