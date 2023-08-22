package org.example;

import org.junit.jupiter.api.Assertions;

public class Main
{
    public static void main(String[] args)
    {
        Product[] products =
        {
            new Product(1000000, "Telefono", "Nokia", 20),
            new Product(1000001, "Bottiglia", "Fontenoce", 30),
            new Product(1000002, "Portafoglio", "Lacoste", 50)
        };

        printManufacturerFirstLetters(products);

        int totalQuantity = 0;
        for (Product product : products)
            totalQuantity += product.getQuantity();

        double averageValue = (double) totalQuantity / products.length;
        System.out.printf("%.2f%n", averageValue);
        Assertions.assertEquals(33.33, averageValue, 0.01);
    }

    public static void printManufacturerFirstLetters(Product[] products)
    {
        char[] expectedChars = {'N', 'F', 'L', 'C'};

        //for (Product product : products)
        char firstChar;
        for (int i = 0; i < products.length; i++)
        {
            firstChar = products[i].getManufacturer().charAt(0);
            System.out.println(firstChar);
            Assertions.assertEquals(firstChar, expectedChars[i]);
        }
    }
}
