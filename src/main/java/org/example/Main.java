package org.example;

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
    }

    public static void printManufacturerFirstLetters(Product[] products)
    {
        for (Product product : products)
            System.out.println(product.getManufacturer().charAt(0));
    }
}
