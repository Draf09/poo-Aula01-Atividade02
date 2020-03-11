public class Carro {
	
	public static char[] toString;
	private float quilometragem;
	private float tanque, capacidade;
	
	public Carro(int cpde) {
		capacidade=cpde;
	}
	
	public float getQuilometragem() {
		return quilometragem;
	}
	public float getCapacidadeTanque() {
		return capacidade;
	}
	public float getCombustivelRestante() {
		return tanque;
	}
	public float getOcupacaoTanque() {
		return (tanque/capacidade)*100;
	}
	public void abastercer(float qtde) {
		if(tanque+qtde<=capacidade)
			tanque+=qtde;
		else
			tanque=capacidade;
	}
	public float deslocar(float kms) {
		
		float consumo = (float)(Math.random()*5.0+10); // consumo máximo 15km/l == mínimo 10
		float combustivelNecessario = kms/consumo;
		System.out.println("  Desempenho do deslocamento " + consumo + "km/l");
		if(combustivelNecessario>tanque) {
			tanque=0;
		    float deslocou=tanque/consumo;
		    quilometragem+=deslocou;
		    return deslocou;
		}
		else {
			tanque-=combustivelNecessario;
		    quilometragem+=kms;
		    return kms;
		}
	}

	public String toString(){
		return "[" + "Kilometragem :" + getQuilometragem() 
		+ getCapacidadeTanque()
		+ getCombustivelRestante() +  
		+ getOcupacaoTanque() + "]"; 
	}
	
}
