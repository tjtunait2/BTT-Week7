package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookDAO {
    private Connection connection = JDBC.getConnectDatabase();

    public List<Book> getBooksFromName(String name) {
        List<Book> listSearchBook = new ArrayList<>();
        try {
            String sqlSelect = "select * from book" + " where name = " + "'" + name + "'";
            PreparedStatement stmt = (PreparedStatement) connection.prepareStatement(sqlSelect);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                listSearchBook.add(new Book(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("publisher"),
                        rs.getInt("price")
                ));
            }

            stmt.close();
            connection.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return listSearchBook;
    }
    public void addBook(Book book) {
        String query = "insert into book(name, publisher, price) " +
                "values (?, ?, ?)";
        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, book.getName());
            ps.setString(2, book.getPublisher());
            ps.setInt(3, book.getPrice());

            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteBook(int id) {
        String query = "delete from book where id = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setInt(1, id);

            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Book> getAllBooks() {
        String query = "select * from book";
        List<Book> listBooks = new ArrayList<>();

        try {
            PreparedStatement ps = connection.prepareStatement(query);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                listBooks.add(new Book(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("publisher"),
                        rs.getInt("price")
                ));
            }
            return listBooks;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}

