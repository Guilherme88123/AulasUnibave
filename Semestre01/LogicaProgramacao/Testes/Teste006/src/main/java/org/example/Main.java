package org.example;

public class Main
{
    public static void main(String[] args)
    {
        ProductDAO dao = new ProductDAO();

        Product product = new Product("Carro", 13010, true);
        dao.create(product);

        var products = dao.getAll();

        for (Product prod : products)
        {
            System.out.println("Produto: " + prod.getId() + " - " + prod.getName());
        }
    }
}