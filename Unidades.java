
public class Unidades{
	private Distancias distancia;
	private Integer dano;
	private Boolean muerte;
	private Integer salud;
	
	public Unidades(Integer distanciaMaxima, Integer distanciaMinima, Integer dano, Integer salud) {
		this.distancia = new Distancias(distanciaMaxima, distanciaMinima);
		this.dano = dano;
		this.salud = salud;
		this.muerte = Boolean.FALSE;
	}
	public Distancias getDistancia() {
		return distancia;
	}

	public void setDistancia(Distancias distancia) {
		this.distancia = distancia;
	}

	public Integer getDano() {
		return dano;
	}

	public void setDano(Integer dano) {
		this.dano = dano;
	}

	public Boolean getMuerte() {
		return muerte;
	}

	public void setMuerte(Boolean muerte) {
		this.muerte = muerte;
	}

	public Integer getSalud() {
		return salud;
	}

	public void setSalud(Integer salud) {
		this.salud = salud;
	}
	public void Atacar(Unidades unidadARestarVida) {
		unidadARestarVida.setSalud(unidadARestarVida.getSalud()-this.getDano());
	}
}
