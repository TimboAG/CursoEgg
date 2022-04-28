Funcion num <- EsMultiplo(num1,num2)
	definir num Como logico
	
	num = num1 MOD num2 == 0
	
FinFuncion




Algoritmo sin_titulo
	definir num1, num2 Como real
	
	escribir "Ingrese el numero que represente al multiplo"
	leer num1
	escribir "Ingrese el numero que queremos saber si es multiplo del primer numero ingresado"
	leer num2
	
	si EsMultiplo(num1, num2) = Verdadero
		escribir "El numero " num1 " es multiplo de " num2
	SiNo
		escribir "El numero " num1 " no es multiplo de " num2
		
	FinSi
	
FinAlgoritmo
