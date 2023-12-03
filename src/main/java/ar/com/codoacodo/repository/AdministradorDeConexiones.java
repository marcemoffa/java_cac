package ar.com.codoacodo.repository;

import java.sql.Connection;
import java.sql.DriverManager;

public class AdministradorDeConexiones {
	//tener un metodo estaticp: un metodo que se puede usar sin crar una instancia de la clase
	//AdministradorDeConexiones.metodo()
public static Connection getConecction() {
	String username= "root";
	String password= "root";
	String port= "3306";
	String host = "localhost";
	String dbName="integrador_cac";
	
	String diverName = "com.mysql.cj.jdbc.Driver";
	String dbUrl = "jdbc:mysql://"+host+":"+port+"/"+dbName + "?allowPublicKeyRetrieval=true&serverTimeZone=UTC&useSSL=false";

	try {
		Class.forName(diverName);
		return DriverManager.getConnection(dbUrl, username, password);
	}catch(Exception e){
		throw new IllegalArgumentException("No se pudo conectar a la db: " + dbUrl);
	}
}

}
