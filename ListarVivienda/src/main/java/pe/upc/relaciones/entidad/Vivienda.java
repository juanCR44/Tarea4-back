package pe.upc.relaciones.entidad;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TP_VIVIENDA")
public class Vivienda {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CODIGO_VIVIENDA")
	private Long codigo;

	private String tipoTerreno;
	private Double precio;
	private Double numHabitaciones;
	private Double numBano;
	private Double dimension;

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getTipoTerreno() {
		return tipoTerreno;
	}

	public void setTipoTerreno(String tipoTerreno) {
		this.tipoTerreno = tipoTerreno;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Double getNumHabitaciones() {
		return numHabitaciones;
	}

	public void setNumHabitaciones(Double numHabitaciones) {
		this.numHabitaciones = numHabitaciones;
	}

	public Double getNumBano() {
		return numBano;
	}

	public void setNumBano(Double numBano) {
		this.numBano = numBano;
	}

	public Double getDimension() {
		return dimension;
	}

	public void setDimension(Double dimension) {
		this.dimension = dimension;
	}

}
