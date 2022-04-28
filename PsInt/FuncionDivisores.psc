Algoritmo Div1
	definir n, a Como Entero
	escribir "Ingrese un numero para saber sus divisores "
	leer n
	
	a =  Divisores(n)
FinAlgoritmo


Funcion suma <- Divisores(num)
	Definir suma Como Entero
	Definir  i Como Entero
	definir cantidad como entero
	suma=0
	cantidad=0
	escribir "Los divisores de " num " son:"
	
	para i = 1 Hasta num  Hacer		
		si num mod i = 0 Entonces
			escribir i
			suma= suma + i
			cantidad= cantidad + 1
		FinSi
	FinPara
	escribir "La suma de sus divisores son: " suma
	escribir "La cantidad de divisores que tiene el numero " num " es:  " cantidad

FinFuncion
	