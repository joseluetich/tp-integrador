package isi.died.tp.dominio;


public class Insumo implements Comparable<Insumo> {

	private String id;
	private String descripcion;
	protected Unidad unidadDeMedida;
	private float costo;
	private int stock;
	private float peso;
	private boolean esRefrigerado;
	
	public Insumo() {
		
	}
	public Insumo(int stock){
		this.stock = stock;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public Unidad getUnidadDeMedida() {
		return unidadDeMedida;
	}

	public void setUnidadDeMedida(Unidad unidadDeMedida) {
		this.unidadDeMedida = unidadDeMedida;
	}

	@Override
	public int compareTo(Insumo otroInsumo) {
		return (this.stock-otroInsumo.stock);
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public float getCosto() {
		return costo;
	}
	public void setCosto(float costo) {
		this.costo = costo;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public boolean isEsRefrigerado() {
		return esRefrigerado;
	}
	public void setEsRefrigerado(boolean esRefrigerado) {
		this.esRefrigerado = esRefrigerado;
	}
	public String toString() {
		return ("Stock: "+this.stock);
	}
	
}
