Algoritmo sin_titulo
	definir matriz1, matriz2, n, i, j Como Entero
	
	
	n = 3
	
	Dimension  matriz1(n,n)
	Dimension  matriz2(n,n)
	
	para i=0 Hasta n-1 Hacer
		para j=0 hasta n-1 Hacer
			matriz1(i,j)= Aleatorio(1,9)
			matriz2(i,j)= Aleatorio(1,9)
		FinPara
	FinPara
	
	escribir "Matriz 1: "
	para i=0 Hasta n-1 Hacer
		para j=0 hasta n-1 Hacer
			escribir sin saltar matriz1(i,j)
		FinPara
		escribir " "
	FinPara
	
	
	
	escribir "Matriz 2: "
	para i=0 Hasta n-1 Hacer
		para j=0 hasta n-1 Hacer
			escribir sin saltar matriz2(i,j)
		FinPara
		escribir " "
	FinPara
	
	
	escribir "El producto de los arreglos es: " Producto(matriz1, matriz2, n)
	
FinAlgoritmo


funcion variable1 =  Producto(matriz1, matriz2, n)
	definir variable1, i, j Como Entero
	variable1=1
	
	
	para i=0 Hasta n-1 Hacer
		para j=0 hasta n-1 Hacer
			variable1=  variable1 + (matriz1(i,j) * matriz2(i,j))
		FinPara
		escribir " "
	FinPara
	
FinFuncion