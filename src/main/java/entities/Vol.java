package entities;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import utils.TypeAvion;

@Entity
public class Vol {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(unique = true)
	@Length(min=4, max=4)
	private String numeroDeVol;
	
	@Enumerated(EnumType.STRING)
	@NotBlank
	private TypeAvion typeAvion;
	
	@NotNull
	private Integer nombreDePlace;
	
	@NotEmpty
	private String villeDeDepart;
	
	@NotEmpty
	private String villeDArrivee;
	
	@NotBlank
	private LocalDate dateDepart;
	
	@OneToMany(mappedBy = "vol")
	private List<Reservation> listDeReservations;
	
	public Vol() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNumeroDeVol() {
		return numeroDeVol;
	}

	public void setNumeroDeVol(String numeroDeVol) {
		this.numeroDeVol = numeroDeVol;
	}

	public TypeAvion getTypeAvion() {
		return typeAvion;
	}

	public void setTypeAvion(TypeAvion typeAvion) {
		this.typeAvion = typeAvion;
	}

	public Integer getNombreDePlace() {
		return nombreDePlace;
	}

	public void setNombreDePlace(Integer nombreDePlace) {
		this.nombreDePlace = nombreDePlace;
	}

	public String getVilleDeDepart() {
		return villeDeDepart;
	}

	public void setVilleDeDepart(String villeDeDepart) {
		this.villeDeDepart = villeDeDepart;
	}

	public String getVilleDArrivee() {
		return villeDArrivee;
	}

	public void setVilleDArrivee(String villeDArrivee) {
		this.villeDArrivee = villeDArrivee;
	}

	public LocalDate getDateDepart() {
		return dateDepart;
	}

	public void setDateDepart(LocalDate dateDepart) {
		this.dateDepart = dateDepart;
	}

	public List<Reservation> getListDeReservations() {
		return listDeReservations;
	}

	public void setListDeReservations(List<Reservation> listDeReservations) {
		this.listDeReservations = listDeReservations;
	}
}
