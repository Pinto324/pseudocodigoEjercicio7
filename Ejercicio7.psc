Algoritmo Ejercicio7
	Escribir 'Generando Numeros al Azar'
	Para i<-1 Hasta 15 Hacer
		num <- Aleatorio(0,36)
		Escribir num
		Si num MOD 2=0 Entonces
			pares <- pares+num
		SiNo
			Si num MOD 2=1 Entonces
				impares <- impares+num
			SiNo
				ceros <- ceros+num
			FinSi
		FinSi
	FinPara
	Escribir 'Porcentaje de Pares ',pares/100,'%'
	Escribir 'Porcentaje de Impares ',impares/100,'%'
	Escribir 'Porcentaje Ceros ',ceros/100,'%'
FinAlgoritmo
