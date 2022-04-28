Algoritmo sin_titulo
	definir vector1,  i, n, suma Como Entero
	
	escribir "Ingrese el tamaño del vector"
	leer n
	dimension vector1(n)
	para i=0 hasta 4 Hacer
		Escribir  "Ingrese el " i+1 "° numero"
		leer vector1(i)
	FinPara
	suma=0
	escribir "Vector: "
	para i=0 hasta 4 Hacer
		escribir sin saltar " " vector1(i)
		suma= suma + vector1(i)
	FinPara
	escribir " "
	escribir "La suma de todos sus elementos es: " suma
	escribir "El promedio de todos sus elementos es: " suma/n
FinAlgoritmo