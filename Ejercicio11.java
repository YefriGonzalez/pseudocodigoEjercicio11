public class Ejercicio11{
	public static void main(String[] args){
		int numero;
		int cantidadNumerosImpares=0;
		double promedioPares;
		int cantidadNumerosPares=0;
		int pares=0;
		int numerosSegundaDocena=0;
		int numeroMayor=0;
		for (int i=0;i<10 ;i++) {
			numero=(int)(Math.random()*10);
			System.out.println(numero);
			if ((numero%2)==0) {
				if (numero==0) {
					System.out.println("El numero 0 se omite");	
				} else {
					pares=pares+numero;
					cantidadNumerosPares=cantidadNumerosPares+1;
				}
			} else {
				cantidadNumerosImpares=cantidadNumerosImpares+1;
			}
			if (numero>numeroMayor) {
				numeroMayor=numero;
			}
			if (numero<=24 && numero>=13) {
				numerosSegundaDocena=numerosSegundaDocena+1;
			}
		}
		promedioPares=pares/cantidadNumerosPares;
		System.out.println("El numero mayor es: "+numeroMayor);
		System.out.println("Cantidad de numeros impares: "+cantidadNumerosImpares);
		System.out.println("Promedio de numeros pares: "+promedioPares);
		System.out.println("Cantidad de numerso que se encuentran en la segunda docena: "+numerosSegundaDocena);
	}
}