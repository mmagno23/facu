package br.edu.univille.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Objects;

public class ConnectionFactory {


    private static ConnectionFactory instance;
    private Connection connection;
    private String url = PropertiesUtils.getUrlByProp();

    private ConnectionFactory() throws SQLException {
        try {
            Class.forName("org.sqlite.JDBC");
            this.connection = DriverManager.getConnection(url);
        } catch (ClassNotFoundException e) {
            System.out.println("Erro ao conectar ao banco de dados: " + e.getMessage());
        }
    }

    public Connection getConnection() {
        return connection;
    }

    public static ConnectionFactory getInstance() throws SQLException {
        if (Objects.isNull(instance) || instance.getConnection().isClosed()) {
            instance = new ConnectionFactory();
        }

        return instance;
    }
}
