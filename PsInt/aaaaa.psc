Algoritmo Div1
	definir n Como Entero
	escribir "Ingrese un numero para saber sus divisores "
	leer n
	
	escribir Divisores(n)
FinAlgoritmo


Funcion i <- Divisores(num)

	Definir  i Como Entero
	
	escribir "Los divisores de " num " son:"
	
	para i = 1 Hasta num  Hacer		
		si num mod i = 0 Entonces
			escribir i
		FinSi
	FinPara
FinFuncion
	