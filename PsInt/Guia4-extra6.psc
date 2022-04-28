Algoritmo sin_titulo
	definir  vector1, i, n, max, min Como Entero
	max=0
	min=999999999
	n=5
	dimension vector1(n)
	
	para i=0 hasta n-1 Hacer
		vector1(i) = Aleatorio(0,20)
	FinPara
	escribir "------------ "
	para i=0 hasta n-1 Hacer
		escribir vector1(i)
	FinPara
	escribir  Valores(vector1,n,i, max, min)
	
FinAlgoritmo


funcion variable1 = Valores(vector1,n,i, max, min)
	
	definir variable1 Como caracter
	
	para i=0 hasta n-1 Hacer
		si max<  vector1(i) Entonces
			max=vector1(i)
		SiNo
			si min > vector1(i) Entonces
				min= vector1(i)
			FinSi
			
		FinSi
	FinPara
	variable1=  "Maximo: " + ConvertirATexto(max) + " - Minimo: " + ConvertirATexto(min)
	escribir variable1
	variable1= "La diferencia que hay entre el valor más chico de un arreglo y su valor más grande:" + ConvertirATexto(max-min)
	
FinFuncion