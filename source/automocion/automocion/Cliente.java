package automocion;

public class Cliente {
	
	private String edad;
	private String poderAdquisitivo;
	private String uso;
	private String sitio;
	private String potencia;
	private String extras;
	private String ocupacion;
	
	
	public String getEdad(){
		return edad;
	}
	public String getPoderAdquisitivo(){
		return poderAdquisitivo;
	}
	public String getUso(){
		return uso;
	}
	public String getSitio(){
		return sitio;
	}
	public String getPotencia(){
		return potencia;
	}
	public String getExtras(){
		return extras;
	}
	public String getOcupacion(){
		return ocupacion;
	}

	public Cliente(String edad, String poderAdquisitivo, String uso, String sitio, String potencia, String extras, String ocupacion) {
		this.edad = edad;
		this.poderAdquisitivo = poderAdquisitivo;
		this.uso = uso;
		this.sitio = sitio;
		this.potencia = potencia;
		this.extras = extras;
		this.ocupacion = ocupacion;
	}
}
