Algoritmo sin_titulo
	definir matriz Como Entero
	dimension matriz(3,3)
	rellenar(matriz, 3,3)
FinAlgoritmo



SubProceso rellenar(matriz, 3,3)
	definir i, j Como Entero
	para i=0 Hasta  2 Con Paso 1 Hacer
		para j=0 hasta 2 Con Paso  1 Hacer
			
			si i=j Entonces
				matriz(i,j) = 0
			SiNo
				matriz(i,j) = Aleatorio(1,3)
			FinSi
			
		FinPara
	FinPara
	
	
	mostrarMatriz(matriz, 3,3)
FinSubProceso

SubProceso 	mostrarMatriz(matriz, 3,3)
	definir i, j Como Entero
	para i=0 Hasta  2 Con Paso 1 Hacer
		para j=0 hasta 2 Con Paso  1 Hacer		
	
		escribir sin saltar	matriz(i,j) 
	FinPara
	Escribir " "
	FinPara
	
FinSubProceso


/// 0 2 3
//  1 0 3
 // 1 2 0
	