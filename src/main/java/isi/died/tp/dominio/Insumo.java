package isi.died.tp.dominio;


public class Insumo implements Comparable<Insumo> {

	private String id;
	private String descripcion;
	protected String unidadDeMedida;
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

	public String getUnidadDeMedida() {
		return unidadDeMedida;
	}

	public void setUnidadDeMedida(String unidadDeMedida) {
		this.unidadDeMedida = unidadDeMedida;
	}

	@Override
	public int compareTo(Insumo otroInsumo) {
		return (this.stock-otroInsumo.stock);
	}
	
	public String toString() {
		return ("Stock: "+this.stock);
	}
	
}
