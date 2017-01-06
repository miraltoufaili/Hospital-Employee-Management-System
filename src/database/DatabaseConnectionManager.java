package database;
import java.sql.Connection;

public class DatabaseConnectionManager {

	private Connection conn;
	private static DatabaseConnectionManager connectionInstance = new DatabaseConnectionManager();
	
	//private DatabaseConnectionManager();{
	
//}


public static DatabaseConnectionManager getManagerInstance(){
	return connectionInstance;
}

public Connection getConnectionObject() {
	return conn; 
}
}