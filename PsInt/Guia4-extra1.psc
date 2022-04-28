Algoritmo sin_titulo
	definir vector1, vector2, i Como Entero
	dimension vector1(5)
	dimension vector2(5)
	
	para i=0 hasta 4 Hacer
		vector1(i) = Aleatorio(1,5)
		vector2(i) = Aleatorio(1,5)
	FinPara
	escribir "Vector 1: "
	para i=0 hasta 4 Hacer
		escribir sin saltar " " vector1(i)
	FinPara
	escribir " "
	escribir "Vector 2: "
	para i=0 hasta 4 Hacer
		escribir Sin Saltar " " vector2(i)
	FinPara
	escribir " "
FinAlgoritmo