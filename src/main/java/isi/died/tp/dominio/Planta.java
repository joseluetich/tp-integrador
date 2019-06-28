package isi.died.tp.dominio;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Planta {
	private Integer id;
	private String nombre;
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Stock> getStocks() {
		return stocks;
	}

	public void setStocks(ArrayList<Stock> stocks) {
		this.stocks = stocks;
	}

	private ArrayList<Stock> stocks;
	
	public double costoTotal() {
		return stocks.stream().mapToDouble((s) -> s.getInsumo().getCosto()*s.getCantidad()).sum();
	}
	
	public List<Insumo> stockEntre(Integer s1, Integer s2){
		return stocks.stream().filter(s->s.getCantidad()<s2).filter(s->s.getCantidad()>s1).map(s->s.getInsumo()).collect(Collectors.toList());
	}
	
	public boolean necesitaInsumo(Insumo i) {
		for(Stock s : stocks) {
			if(s.getInsumo()==i) {
				if(s.getPuntoPedido()-s.getCantidad()>0)
					return true;
			}
		}
		return false;
	}
}
