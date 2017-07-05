package co.simplon.poleEmploi.patrimoine.modele;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "CITIES")
public class Ville {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private Long id;

	@Column(name = "NAME")
	private String nom;

	@Column(name = "LATITUDE")
	private double latitude;

	@Column(name = "LONGITUDE")
	private double longitude;

	@OneToMany
	@JoinColumn(name="CITIES_ID")
	private Set<Monument> monuments;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getLongitude() {
		return this.longitude;
	}

	public double getLatitude() {
		return this.latitude;
	}
	
	public Set<Monument> getMonuments() {
		return monuments;
	}
}
