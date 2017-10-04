
public class Caballeros extends Unidades{
	private Integer caballo;
	public Caballeros() {
		super(2,1,50,200);
		this.setCaballo(0);
	}
	public Integer getCaballo() {
		return caballo;
	}
	public void setCaballo(Integer caballo) {
		this.caballo = caballo;
	}
}
