package automocion;

public class Coche {

	private String marca;	
	private String caja;
	private String carroceria;
	private String combustible;
	private String potencia;
	private String precio;
	private String motor;	
	private int id;
	
	public Coche(String marca, String caja, String carroceria, String combustible, String potencia, String precio, String motor) {
		super();
		this.marca = marca;
		this.caja = caja;
		this.carroceria = carroceria;
		this.combustible = combustible;
		this.potencia = potencia;
		this.precio = precio;
		this.motor = motor;
	}
	
	public Coche(){
		
	}
	
	public void setCoche(String marca, String caja, String carroceria, String combustible, String potencia, String precio, String motor) {
		this.marca = marca;
		this.caja = caja;
		this.carroceria = carroceria;
		this.combustible = combustible;
		this.potencia = potencia;
		this.precio = precio;
		this.motor = motor;
	}

	public String getCaja() {
		return caja;
	}

	public String getCarroceria() {
		return carroceria;
	}

	public String getCombustible() {
		return combustible;
	}

	public String getMarca() {
		return marca;
	}

	public String getMotor() {
		return motor;
	}

	public String getPotencia() {
		return potencia;
	}

	public String getPrecio() {
		return precio;
	}
	
	
	
	public String toString(){
		String resultado;
		resultado = "ID:" + id + "\n"
					+ "Nombre:"+ marca+ "\n"
					+ "Caja de cambios:"+ caja + "\n"
					+ "Carroceria: "+ carroceria + "\n"
					+ "Combustible:"+ combustible + "\n"
					+ "Potencia:"+ potencia + "\n"
					+ "Precio:"+ precio + "\n"
					+ "Motor:"+ motor + "\n";
		return resultado;
	}

	

}
