package Pharmacy;

import java.math.BigDecimal;


public class Product {
	
	private int IdProduct ;
	private String nom;
	private String decription;
	private int quantite;
	private BigDecimal prix;
	
	
	
	
	
	//Getters :::
	public int getIdProduct() {
		return IdProduct;
	}
	public String getNom() {
		return nom;
	}
	public String getDecription() {
		return decription;
	}
	public int getQuantite() {
		return quantite;
	}
	public BigDecimal getPrix() {
		return prix;
	}
	
	
	//Setters :::
	public void setIdProduct(int idProduct) {
		IdProduct = idProduct;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public void setDecription(String decription) {
		this.decription = decription;
	}
	
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	
	public void setPrix(BigDecimal prix) {
		this.prix = prix;
	}
	public Product(int idProduct, String nom, String decription, int quantite, BigDecimal prix) {
		super();
		IdProduct = idProduct;
		this.nom = nom;
		this.decription = decription;
		this.quantite = quantite;
		this.prix = prix;
	}
	
	
	@Override
	public String toString() {
		return "Product [IdProduct=" + IdProduct + ", nom=" + nom + ", decription=" + decription + ", quantite="
				+ quantite + ", prix=" + prix + "]";
	}
	
	
	

}
