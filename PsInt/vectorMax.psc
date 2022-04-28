Algoritmo sin_titulo
	Definir vector, n, i Como Entero
	
	Escribir "Ingrese el tamaño del vector: " 
	leer n
	
	Dimension vector(n)
	Para i=0 hasta n-1
		Escribir "Ingrese un valor para la posicion " i + 1 ":"
		Leer vector(i)
	FinPara
	
	Escribir "El valor máximo en el vector es: " elMasGrande(vector, n)
FinAlgoritmo

Funcion value <- elMasGrande(vector, n)
	Definir max, i, value Como Entero
	max = 0
	
	Para i=0 hasta n-1
		si max < vector(i)
			max = vector(i)
		FinSi
	FinPara
	
	value = max
FinFuncion
