import java.sql.*;
import java.util.ArrayList;

public class DatabaseManager
{
    private Connection _connection;

    private String _url = "jdbc:postgresql://localhost:5432/Teste005";
    private String _user = "postgres";
    private String _password = "Unibave";

    public DatabaseManager()
    {
        if (!DbExists())
        {
            CreateDb();
        }

        ConnectDb();

        if (!TableExists())
        {
            CreateTable();
        }
    }

    private void CreateDb()
    {
        try
        {
            Connection conn = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/postgres",
                    "postgres",
                    "Unibave"
            );

            Statement stmt = conn.createStatement();
            stmt.executeUpdate("CREATE DATABASE \"Teste005\"");
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }

    private boolean DbExists()
    {
        try
        {
            Connection conn = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/postgres",
                    "postgres",
                    "Unibave"
            );

            PreparedStatement ps = conn.prepareStatement("SELECT 1 FROM pg_database WHERE datname = ?");

            ps.setString(1, "Teste005");

            ResultSet set = ps.executeQuery();

            return set.next();
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }

        return false;
    }

    private void ConnectDb()
    {
        try
        {
            _connection = DriverManager.getConnection(_url, _user, _password);

            if (_connection != null)
            {
                System.out.println("Conectado ao Banco de Dados!");
            }
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }

    private boolean TableExists()
    {
        try
        {
            PreparedStatement ps = _connection.prepareStatement("SELECT 1 FROM pg_tables WHERE schemaname = 'public' AND tablename = 'usuarios'");

            ResultSet set = ps.executeQuery();

            return set.next();
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }

        return false;
    }

    private void CreateTable()
    {
        try
        {
            String sql = "CREATE TABLE usuarios (" +
                    "    id VARCHAR(100)," +
                    "    name VARCHAR(100)," +
                    "    email VARCHAR(100)" +
                    ");";

            PreparedStatement ps = _connection.prepareStatement(sql);

            ps.executeUpdate();
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }

    public ArrayList<User> ReadUsers()
    {
        try
        {
            ArrayList<User> _usersList = new ArrayList<User>();

            String _sql = "SELECT * FROM usuarios";
            Statement _stat = _connection.createStatement();
            ResultSet _set = _stat.executeQuery(_sql);

            while (_set.next())
            {
                String id = _set.getString("id");
                String name = _set.getString("name");
                String email = _set.getString("email");

                User _user = new User(id, name, email);
                _usersList.add(_user);
            }

            return _usersList;
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }

        return new ArrayList<User>();
    }

    public void CreateUser(User user)
    {
        try
        {
            String _sql = "INSERT INTO usuarios (id, name, email) VALUES (?, ?, ?)";

            PreparedStatement _prepareStat = _connection.prepareStatement(_sql);

            _prepareStat.setString(1, user.getId());
            _prepareStat.setString(2, user.getNome());
            _prepareStat.setString(3, user.getEmail());

            _prepareStat.executeUpdate();
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }
}
