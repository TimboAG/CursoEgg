Algoritmo sin_titulo
	definir arreglo1, matriz, n, i, j, aux, aux2 Como Entero
	
	n=3
	
	Dimension matriz(n,n)
	dimension arreglo1(n)
	dimension aux(n,n)
	dimension aux2(n,n)
	
	
	para i=0 hasta n-1 Hacer
		para j=0 hasta n-1 Hacer
			matriz(i,j) = Aleatorio(1,9)
		FinPara		
	FinPara
	
	para i=0 hasta n-1 Hacer
		arreglo1(i)= Aleatorio(1,9)
	FinPara
	
	
	
	escribir "La matriz es:"
	
	para i=0 hasta n-1 Hacer
		para j=0 hasta n-1 Hacer
		escribir sin saltar	matriz(i,j) 
	FinPara
	escribir " "
FinPara


	escribir " "
	escribir "---------------------------- "
	escribir "El arreglo es: "
	para i=0 hasta n-1 Hacer
		escribir sin saltar " " arreglo1(i)
	FinPara
	
	
	escribir " "
	escribir "---------------------------- "
	escribir "La  multiplicacion de ambos es: "
	
	
	para i=0 hasta n-1 Hacer
		para j=0 hasta n-1 Hacer
			aux(i,j) = matriz(i,j) * arreglo1(j)
		FinPara		
	FinPara
	
	
	
	
	
	para i=0 hasta n-1 Hacer
		para j=0 hasta n-1 Hacer
			escribir aux(i,j)
		FinPara		
	FinPara
	
	
	
	
	para i=0 hasta n-1 Hacer
		para j=0 hasta n-1 Hacer
			
			aux2(i,j) = 0 + aux(i,j)
		FinPara		
	FinPara
	
	
	escribir " "
	escribir "---------------------------- "
	
	para i=0 hasta n-1 Hacer
		para j=0 hasta n-1 Hacer
			escribir sin saltar " " aux2(i,j) 
		FinPara	
		escribir " "
	FinPara

FinAlgoritmo
