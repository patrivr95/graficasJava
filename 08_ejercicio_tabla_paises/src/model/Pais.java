package model;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;
@Setter
@Getter

public class Pais {
	@SerializedName("region")
	private String Continente;
	@SerializedName("name")
	private String Pais;
	@SerializedName("capital")
	private String capital;
	@SerializedName("population")
	private long poblacion;
	@SerializedName("flag")
	private String bandera;
	public Pais(String pais, String capital, long poblacion, String bandera) {
		super();
		Pais = pais;
		this.capital = capital;
		this.poblacion = poblacion;
		this.bandera = bandera;
	}
	public Pais() {
		super();
	}
	
	@Override
	public String toString() {
		return Pais;
	}
	
	
}
