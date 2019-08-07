import java.util.Scanner;

public class principal {
	
	public static void main(String args []) {
		carro pehDePano = new carro(65);
		Scanner input = new Scanner(System.in);
		
		int opcao=0;
		while(opcao>=0) {
			System.out.println("Opcoes de operacao com o carro: ");
			System.out.println("  1 - Odometro: ");
			System.out.println("  2 - Capacidade do tanque (lts) ");
			System.out.println("  3 - Qtde de combustivel dispon�vel (lts) ");
			System.out.println("  4 - Ocupa��o do tanque de combustivel (%) ");
			System.out.println("  5 - Abastecer o carro ");
			System.out.println("  6 - Deslocar");
			System.out.println("  0 - SAIR");
			System.out.print("Informe a opc�o: ");
			
			opcao=input.nextInt();
			if(opcao==0) break;
			
			switch(opcao) {
			  case 1:
				  System.out.println("1: "+pehDePano.getQuilometragem()+" (km)");
				  break;
			  case 2:
				  System.out.println("2: "+pehDePano.getCapacidadeTanque()+" (lts)");
				  break;
			  case 3:
				  System.out.println("3: "+pehDePano.getCombustivelRestante()+" (lts)");
				  break;
			  case 4:
				  System.out.println("4: "+pehDePano.getOcupacaoTanque()+"%");
				  break;
			  case 5:
				  System.out.print("5: Informe a qtde de litros a abastecer:");
				  float val=input.nextFloat();
				  pehDePano.abastercer(val);
				  System.out.println("5: Carro abastecido");
				  break;
			  case 6:
				  if(pehDePano.getCombustivelRestante()==0) {
					  System.out.println("6: TCHE.... MAS N�O TEM COMBUSTIVEL... ABASTECE PRIMEIRO:");
					  break;
				  }
				  System.out.print("6: Informe a qtde de kms a deslocar:");
				  float kms=input.nextFloat();
				  float deslocou=pehDePano.deslocar(kms);
				  if(deslocou<kms)
					  System.out.println("  CARRO PAROU NO CAMINHO... ABASTE�A");
				  else
					  System.out.println("  CARRO CHEGOU AO DESTINO");
				  break;
			  default:
				  System.out.println("OPCAO INFORMADA N�O � V�LIDA");
				  break;
			}			
		}
		System.out.println("FIM DO PROGRAMA");
		
	}

}
