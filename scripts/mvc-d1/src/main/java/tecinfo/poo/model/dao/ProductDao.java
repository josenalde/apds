package tecinfo.poo.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import tecinfo.poo.model.Product;

public class ProductDao implements Dao<Product> {

    @Override
    public Product get(Long id) {
        Product product = null;
        String sql = "select * from tbproducts where id = ?"; // ? is a parameters for the prepared statement
        Connection conn = null;
        // prepares a query
        PreparedStatement preparedStatement = null;
        ResultSet resultSet= null; //stores the query result

        try {
            conn = DBConnection.getConnection();
            preparedStatement = conn.prepareStatement(sql);
            // sending the parameter to sql execution
            preparedStatement.setInt(1, id.intValue()); // id is an object, not primitive (intValue required)
            resultSet = preparedStatement.executeQuery();
            // iterates the resultSet and stores in the object the column values from the database
            while (resultSet.next()){
                product = new Product();
                product.setId(resultSet.getLong("id")); // "id" is the column at postgres
                product.setName(resultSet.getString("name"));
                product.setQuantity(resultSet.getLong("quantity"));
                product.setValue(resultSet.getFloat("value"));
            }
        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            // close all connections
            try {
                if (preparedStatement != null) preparedStatement.close();
                if (conn != null) conn.close();
            } catch(Exception e) {
                e.printStackTrace();
            }
        }
        return product;
    }

    @Override
    public List<Product> list() { //listAll (if the database is huge, consider the use of pagination)
        List<Product> products = new ArrayList<Product>();
        String sql = "select * from tbproducts"; 
        Connection conn = null;
        // prepares a query
        PreparedStatement preparedStatement = null;
        ResultSet resultSet= null; //stores the query result

        try {
            conn = DBConnection.getConnection();
            preparedStatement = conn.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            // iterates the resultSet and stores in the object the column values from the database
            while (resultSet.next()){
                Product product = new Product();
                product.setId(resultSet.getLong("id")); // "id" is the column at postgres
                product.setName(resultSet.getString("name"));
                product.setQuantity(resultSet.getLong("quantity"));
                product.setValue(resultSet.getFloat("value"));

                products.add(product); //add the object filled with database data to products list
            }
        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            // close all connections
            try {
                if (preparedStatement != null) preparedStatement.close();
                if (conn != null) conn.close();
            } catch(Exception e) {
                e.printStackTrace();
            }
        }
        return products;
    }

    @Override
    public int save(Product product) {
        String sql = "insert into tbproducts (name, quantity, value)" + " values (?, ?, ?)"; 
        Connection conn = null;
        // prepares a query
        PreparedStatement preparedStatement = null;
        
        try {
            conn = DBConnection.getConnection();
            preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, product.getName());
            preparedStatement.setLong(2, product.getQuantity());
            preparedStatement.setFloat(3, product.getValue());
            
            preparedStatement.execute(); //it is not a query. It is an insert command
            
        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            // close all connections
            try {
                if (preparedStatement != null) preparedStatement.close();
                if (conn != null) conn.close();
                return 1;
            } catch(Exception e) {
                e.printStackTrace();
            }
        }
        return 0;
    }

    @Override
    public boolean update(Product product, String[] params) {
        // if you use params, use parse methods (parseFloat, parseLong etc.)
        String sql = "update tbproducts set name = ?, quantity = ?, value = ? where id = ?"; 
        Connection conn = null;
        // prepares a query
        PreparedStatement preparedStatement = null;
        
        try {
            conn = DBConnection.getConnection();
            preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, product.getName());
            preparedStatement.setLong(2, product.getQuantity());
            preparedStatement.setFloat(3, product.getValue());
            preparedStatement.setLong(4, product.getId());
            
            preparedStatement.execute(); //it is not a query. It is an insert command
            
        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            // close all connections
            try {
                if (preparedStatement != null) preparedStatement.close();
                if (conn != null) conn.close();
                return true;
            } catch(Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    @Override
    public boolean delete(Product product) {
        String sql = "delete from tbproducts where id = ?"; 
        Connection conn = null;
        // prepares a query
        PreparedStatement preparedStatement = null;
        
        try {
            conn = DBConnection.getConnection();
            preparedStatement = conn.prepareStatement(sql);
            
            preparedStatement.setLong(1, product.getId());
            
            preparedStatement.execute(); //it is not a query. It is an insert command
            
        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            // close all connections
            try {
                if (preparedStatement != null) preparedStatement.close();
                if (conn != null) conn.close();
                return true;
            } catch(Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }
    
}
