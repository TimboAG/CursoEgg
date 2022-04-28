Algoritmo sin_titulo
	definir matriz, n Como Entero
	
	escribir "Ingrese el tamaño de la matriz"
	leer n
	
	Dimension  matriz(n,n)
	llenar(matriz,n)
FinAlgoritmo

SubProceso llenar(matriz,n)
	definir i, j Como Entero
	para i=0 Hasta n-1 Hacer
		para j=0 hasta n-1 Hacer
			matriz(i,j)= Aleatorio(1,9)
		FinPara
		
	FinPara
	mostrar1(matriz,n)
FinSubProceso

SubProceso  mostrar1(matriz,n )
	definir i, j Como Entero
	
	para i=0 Hasta n-1 Hacer
		para j=0 hasta n-1 Hacer
			escribir sin saltar matriz(i,j)
		FinPara
		escribir " "
	FinPara
FinSubProceso