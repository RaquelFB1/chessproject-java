package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ExerciciosVetores {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos pessoas digitadas?: ");
		int n = sc.nextInt();
		
		double[] altura = new double[n];
        char[] genero = new char[n];
        
        for(int i=0;i<n;i++) {
        	System.out.print("Altura da " + (i + 1) + "a pessoa ");
        	altura[i] = sc.nextDouble();
        	System.out.print("Genero da " + i + "a pessoa ");
            genero[i] = sc.next().charAt(0);
            
        }
		
        double menorAltura = altura[0];
        double maiorAltura = altura[0];
        
        for(int i=0;i<n;i++) {
        	if(altura[i] < menorAltura) {
        		menorAltura = altura[i];
        	}
             if(altura[i] > maiorAltura) {
                maiorAltura = altura[i];
            }
        }
            
        
        double mediaalturamulheres = 0;
        double somamulheres = 0;
        int qtdMulheres = 0;
        int qtdHomens = 0;
        
        for(int i=0;i<n;i++) {
        	if(genero[i] == 'F') {
        		qtdMulheres++;
        		somamulheres = somamulheres + altura[i];
        		mediaalturamulheres = somamulheres/qtdMulheres;
        	}
        	else if(genero[i] == 'M'){
        		qtdHomens++;
        	}
        }
        System.out.printf("Menor altura = %.2f\n", menorAltura);
	    System.out.printf("Maior altura = %.2f\n", maiorAltura);
	    System.out.printf("Media das alturas das mulheres = %.2f\n", mediaalturamulheres);
	    System.out.printf("Numero de homens = %d\n", qtdHomens);
        
	}
				
}
		


