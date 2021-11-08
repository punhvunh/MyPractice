package by.epam.learn.classes.javabeanwithxml;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.*;

public class XmlSerializableMain {
    public static void main(String[] args) {
        try  (XMLEncoder xmlEncoder = new XMLEncoder(new BufferedOutputStream(
                new FileOutputStream("data.serial.xml")))){
            Order order = new Order(11,15.0);
            xmlEncoder.writeObject(order);
            xmlEncoder.flush();
            } catch (FileNotFoundException e){
                e.printStackTrace();
            }
        try  (XMLDecoder xmlDecoder = new XMLDecoder(new BufferedInputStream(
                new FileInputStream("data.serial.xml")))){
            Order order = (Order)xmlDecoder.readObject();
            System.out.println(order);
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
