Funcion num <- Impar(num1)
	definir num Como logico
	
	num = num1 MOD 2 == 1
	
FinFuncion




Algoritmo sin_titulo
	definir num1 Como real
	
	escribir "Ingrese un numero para saber si es impar "
	leer num1

	
	si Impar(num1) = Verdadero
		escribir "El numero ingresado es impar" 
	SiNo
		escribir "El numero ingresado es par" 
		
	FinSi
	
	
	
FinAlgoritmo
