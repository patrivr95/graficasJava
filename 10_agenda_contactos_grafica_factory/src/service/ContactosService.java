package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Contacto;

public interface ContactosService {
	
	boolean guardarContacto(Integer numero, String nombre, String email, int edad);

	Contacto buscarContacto(Integer numero);

	void eliminarContacto(Integer numero);

	List<Contacto> contactos();
}
