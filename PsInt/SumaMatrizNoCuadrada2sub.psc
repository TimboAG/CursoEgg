Algoritmo sin_titulo
	
	definir nombre_matriz, num,  n, m como entero
	definir variable Como Caracter	
	escribir "Ingrese el valor de la fila de la matriz"
	leer n		
	escribir "Ingrese el valor de la columna de la matriz"
	leer m		
	dimension nombre_matriz(n,m)	
	Llenar(nombre_matriz, n,m)	
FinAlgoritmo


SubProceso Llenar(nombre_matriz, n,m)	
	Definir  i, j, var Como Entero	
	Para i<-0 Hasta n-1 Con Paso 1 Hacer
		Para j<-0 hasta m-1 Con Paso 1 Hacer			
			nombre_matriz(i,j) = Aleatorio(1,100)			
			escribir "Fila:" n ", Columna: " m ", valor: " nombre_matriz(i,j)	
		Fin Para		
	Fin Para
	escribir Suma(nombre_matriz, n ,m)	
FinSubProceso



funcion variable1 <- Suma(nombre_matriz,n,m)	
definir variable1, var Como Entero	
Definir  i, j Como Entero
var=0
Para i<-0 Hasta n-1 Con Paso 1 Hacer
	Para j<-0 hasta m-1 Con Paso 1 Hacer
     var = var + nombre_matriz(i,j)
		Fin Para
Fin Para
	variable1 = var
FinFuncion
