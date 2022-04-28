Algoritmo sin_titulo
	definir  vector2, i, n Como Entero
	definir vector1 Como Caracter
	
	escribir "Ingrese el tamaño del vector"
	leer n
	dimension vector1(n)
	dimension vector2(n)
	
	para i=0 hasta 4 Hacer
		Escribir  "Ingrese el " i+1 "° nombre"
		leer vector1(i)
	FinPara
	
	para i=0 hasta 4 Hacer
		vector2(i) = Longitud(vector1(i))
	FinPara
	
	para i=0 hasta 4 Hacer
		escribir  " Nombre: " vector1(i)  " - Longitud: "  vector2(i)
	FinPara
	escribir " "
	
	
FinAlgoritmo
