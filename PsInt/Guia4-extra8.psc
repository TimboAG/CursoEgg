Algoritmo sin_titulo
	definir arreglo1, n, i Como Entero
	
	escribir "Ingrese el tamaño del arreglo"
	leer n
	
	Dimension  arreglo1(n)
	
	para i=0 Hasta n-1 Hacer
		arreglo1(i)= Aleatorio(1,9)
	FinPara
	
	para i=0 Hasta n-1 Hacer
		escribir arreglo1(i)
	FinPara
	
	escribir "El producto del arreglo es: " Producto(arreglo1, n, i)
	
FinAlgoritmo


funcion variable1 =  Producto(arreglo1, n, i)
	definir variable1 Como Entero
	variable1=1
	para i=0 Hasta n-1 con paso 1 Hacer
		variable1= variable1 * arreglo1(i)
	FinPara
	
FinFuncion