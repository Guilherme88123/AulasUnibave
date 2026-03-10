import java.sql.*;

public class Main
{
    private String url = "jdbc:postgresql://localhost:5432/Teste004";
    private String usuario = "postgres";
    private String senha = "Unibave";

    private Connection _connection;

    public static void main(String[] args)
    {
        Main app = new Main();

        app.ConnectDatabase();

        //app.CreateTable();
        //app.InsertProduto(2, "Cadeira", 800.00);
        app.SelectProdutos();
    }

    public void ConnectDatabase()
    {
        try
        {
            _connection = DriverManager.getConnection(url, usuario, senha);

            if (_connection != null)
            {
                System.out.println("Conectado ao PostgreSQL!");
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public void CreateTable()
    {
        try
        {
            String sql = "CREATE TABLE produtos (" +
                    "    id INTEGER PRIMARY KEY," +
                    "    name VARCHAR(100) NOT NULL," +
                    "    price DOUBLE PRECISION NOT NULL" +
                    ");";

            PreparedStatement ps = _connection.prepareStatement(sql);

            ps.executeUpdate();
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }

    public void InsertProduto(int id, String name, double price)
    {
        try
        {
            String sql = "INSERT INTO produtos(id, name, price) VALUES (?, ?, ?)";

            PreparedStatement ps = _connection.prepareStatement(sql);
            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setDouble(3, price);

            ps.executeUpdate();
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }

    public void SelectProdutos()
    {
        try
        {
            Statement stmt = _connection.createStatement();

            ResultSet rs = stmt.executeQuery("SELECT * FROM produtos");

            while (rs.next()) {
                System.out.println(rs.getInt("id") +
                        " - " +
                        rs.getString("name") +
                        " - " +
                        rs.getDouble("price"));
            }
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }
}