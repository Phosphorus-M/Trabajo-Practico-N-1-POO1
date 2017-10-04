
public class Distancias {
	private Integer distanciaMaxima;
	private Integer distanciaMinima;
	public Distancias() {
		this.setDistanciaMaxima(0);
		this.setDistanciaMinima(0);
	}
	public Distancias(Integer distanciaMaxima, Integer distanciaMinima) {
		this.setDistanciaMaxima(distanciaMaxima);
		this.setDistanciaMinima(distanciaMinima);
	}
	public Integer getDistanciaMaxima() {
		return this.distanciaMaxima;
	}
	public void setDistanciaMaxima(Integer distanciaMaxima) {
		this.distanciaMaxima = distanciaMaxima;
	}
	public Integer getDistanciaMinima() {
		return this.distanciaMinima;
	}
	public void setDistanciaMinima(Integer distanciaMinima) {
		this.distanciaMinima = distanciaMinima;
	}
}
