
public class Arqueros extends Unidades{
	private Integer flechas;
	public Arqueros() {
		super(5, 2, 5, 50);
		this.setFlechas(20);
	}
	public Integer getFlechas() {
		return flechas;
	}
	public void setFlechas(Integer flechas) {
		this.flechas = flechas;
	}
}
