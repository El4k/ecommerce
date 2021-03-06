package pear.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="pedidos")
public class Pedido {

	@Id @GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	@ManyToOne
	private Usuario usuario;
	@ManyToMany
	private List<Produto> listaProdutos = new ArrayList<>();
	private double valorTotal;
	private double valorFrete;
	private Integer prazoEntrega;
	
	public Pedido() {
	}
	
	public Pedido(double valorTotal, double valorFrete, Integer prazoEntrega) {
		this.valorTotal = valorTotal;
		this.valorFrete = valorFrete;
		this.prazoEntrega = prazoEntrega;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public List<Produto> getListaProdutos() {
		return listaProdutos;
	}
	public void setListaProdutos(List<Produto> listaProdutos) {
		this.listaProdutos = listaProdutos;
	}
	public double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	public double getValorFrete() {
		return valorFrete;
	}
	public void setValorFrete(double valorFrete) {
		this.valorFrete = valorFrete;
	}
	public Integer getPrazoEntrega() {
		return prazoEntrega;
	}
	public void setPrazoEntrega(Integer prazoEntrega) {
		this.prazoEntrega = prazoEntrega;
	}
	
	public void addProduto(Produto produto) {
		this.listaProdutos.add(produto);
	}

	public void removeProduto(Integer pos) {
		Object produto = listaProdutos.get(pos);
		listaProdutos.remove(produto);
	}
}
