package br.tecinfo;

import java.util.ArrayList;
import java.util.List;

import br.tecinfo.model.Product;
import br.tecinfo.repository.ProductDao;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<Product>();
        ProductDao productDao = new ProductDao();
        System.out.println("LISTAGEM DE PRODUTOS NO BANCO DE DADOS");
        System.out.println("----------------------------------------");
        products = productDao.list();
        if (products.size() > 0) {
            for (int i = 0; i < products.size(); i++) {
                System.out.print("id: " + products.get(i).getId());
                System.out.print(", name: " + products.get(i).getName());
                System.out.print(", quantity: " + products.get(i).getQuantity());
                System.out.println(", value: " + products.get(i).getValue());
            }
        }
        System.out.println("--------------------------------------------------");
        //------------

        //CONSULTA (RETRIEVE BY ID - GET)

        Product productA = new Product();
        productA = productDao.get(2L);
        System.out.println(productA);

        //productA = productDao.get(10L);
        //if (productA != null) System.out.println(productA);
        //else System.out.println("Produto nao encontrado");
        
        //--------------------------------------------------------
        System.out.println("----------------------------------------");

        //String nome, quantidade, valor;
        
        //Product productB = new Product("ventilador", 5L, 240.50f);
        //Product productC = new Product("lego mindstorms", 1L, 2000.00f);

        //productDao.add(productB);
        //productDao.add(productC);

        //----------------------------------------------------------------

        //APAGAR UM REGISTRO

        productDao.delete(productA);

        products = productDao.list();
        if (products.size() > 0) {
            for (int i = 0; i < products.size(); i++) {
                System.out.print("id: " + products.get(i).getId());
                System.out.print(", name: " + products.get(i).getName());
                System.out.print(", quantity: " + products.get(i).getQuantity());
                System.out.println(", value: " + products.get(i).getValue());
            }
        }
        System.out.println("--------------------------------------------------");

    }
}