Algoritmo sin_titulo
	definir matriz, n, m, matrizTranspuesta Como Entero
	definir i, j Como Entero
	
	escribir "Ingrese el tamaño de la columna de la matriz"
	leer n
	
	escribir "Ingrese el tamaño de la fila de la matriz"
	leer m
	
	Dimension  matriz(n,m)
	
	para i=0 Hasta n-1 Hacer
		para j=0 hasta m-1 Hacer
			matriz(i,j)= Aleatorio(1,9)
		FinPara
	FinPara
	
	
	
	para i=0 Hasta n-1 Hacer
		para j=0 hasta m-1 Hacer
			escribir sin saltar matriz(i,j)
		FinPara
		escribir " "
	FinPara
	
	Dimension  matrizTranspuesta(m,n)
	para i=0 Hasta n-1 Hacer
		para j=0 hasta m-1 Hacer
			matrizTranspuesta(j,i)= matriz(i,j)
		FinPara
	FinPara
	
	
	escribir "La matriz transpuesta es:"
	para i=0 Hasta m-1 Hacer
		para j=0 hasta n-1 Hacer
			escribir sin saltar matrizTranspuesta(i,j)
		FinPara
		escribir " "
	FinPara
	
	
FinAlgoritmo