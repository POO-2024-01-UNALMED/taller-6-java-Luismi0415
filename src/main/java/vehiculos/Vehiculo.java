package vehiculos;

public class Vehiculo {
	private String placa;
	protected int puertas;
	protected int velocidadMaxima;
	private String nombre;
	private int precio;
	private int peso;
	protected String traccion;
	private Fabricante fabricante;
	private static int cantidadVehiculos;
	
	public Vehiculo(String placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso,
			String traccion,Fabricante fabricante) {
		this.placa = placa;
		this.puertas = puertas;
		this.velocidadMaxima = velocidadMaxima;
		this.nombre = nombre;
		this.precio = precio;
		this.peso = peso;
		this.traccion = traccion;
		this.fabricante=null;
		cantidadVehiculos++;
	}

	public Vehiculo(String placa, String nombre, int precio, int peso, Fabricante fabricante) {
		this.placa = placa;
		this.nombre = nombre;
		this.precio = precio;
		this.peso = peso;
		this.fabricante=fabricante;
		cantidadVehiculos++;
	}

	public Vehiculo(String placa, int puertas, String nombre, Fabricante fabricante, int precio, int peso) {
		this.placa = placa;
		this.puertas = puertas;
		this.nombre = nombre;
		this.precio = precio;
		this.peso = peso;
		this.fabricante=fabricante;
		cantidadVehiculos++;
	}
	
	public static String vehiculosPorTipo() {
		
		return "Automoviles: "+Automovil.getListado().size()+"\n"+ 
		"Camionetas: "+Camioneta.getListado().size()+"\n"+ 
		"Camiones: "+Camion.getListado().size();

	}
	

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getPuertas() {
		return puertas;
	}

	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}

	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}

	public void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public String getTraccion() {
		return traccion;
	}

	public void setTraccion(String traccion) {
		this.traccion = traccion;
	}

	public Fabricante getFabricante() {
		return fabricante;
	}

	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}

	public static int getCantidadVehiculos() {
		return cantidadVehiculos;
	}

	public static void setCantidadVehiculos(int cantidadVehiculos) {
		Vehiculo.cantidadVehiculos = cantidadVehiculos;
	}
	
	
	

}