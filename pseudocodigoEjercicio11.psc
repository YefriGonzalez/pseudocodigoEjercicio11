Algoritmo Ejercicio11
	impares=0
	pares=0
	cantidadDeNumerosPares=0
	numerosSegundaDocena=0
	mayorr=0
	para i=1 Hasta 10 Con Paso 1 Hacer
		num=Aleatorio(0,36)
		si (num%2=0) Entonces
			si num=0 Entonces
				Escribir "El numero 0 se omite"
			SiNo
				pares=pares+num
				cantidadDeNumerosPares=cantidadDeNumerosPares+1
			FinSi
		SiNo
			impares=impares+1
		FinSi
		si num>mayorr Entonces
			mayorr=num
		FinSi
		si num<24 y num>13 Entonces
			numerosSegundaDocena=numerosSegundaDocena+1
		FinSi
	FinPara
	promedioNumerosPares=pares/cantidadDeNumerosPares
	Escribir "El numero mayor es: " mayorr
	Escribir "Cantidad de numeros impares: " impares
	Escribir "Promedio de numeros pares: " promedioNumerosPares
	Escribir "Cantidad de numeros que se encuentran entre 13 y 24 : " numerosSegundaDocena
FinAlgoritmo
