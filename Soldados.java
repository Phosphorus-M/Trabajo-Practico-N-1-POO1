
public class Soldados extends Unidades{
	Integer __ENERGIAACONSUMIR = 10;
	private Integer energia;
	
	public Soldados() {
		super(1, 0, 10, 200);
		this.setEnergia(100);
	}
	public Integer getEnergia() {
		return energia;
	}
	public void setEnergia(Integer energia) {
		this.energia = energia;
	}
	public void verificarEngergia(Unidades unidadARestarVida) {
		if(this.energia>10) {
			this.Atacar(unidadARestarVida);
			this.energia = this.energia - 10;
		}		
	}
	
}
