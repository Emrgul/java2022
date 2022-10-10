package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class JdbcProductDao implements ProductDao{

    // al bu ürünü ekle demektir burada product nesnesini kullanmak.
    public void add(Product product){
        // sadece db erişim kodları buraya yazılır... SQL
        System.out.println("JDBC ile veritabanına eklendi ");
    }








}
