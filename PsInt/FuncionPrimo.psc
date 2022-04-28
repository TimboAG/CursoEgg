Funcion num <- Primo(num1)
	definir num Como entero
	definir i como entero
	definir buscar como entero
	
	buscar = 0
	
	Para i = 1 Hasta num1 Con Paso 1 Hacer
		si num1 MOD i == 0 Entonces			
			buscar = buscar + 1		
		SiNo
			buscar = buscar
		FinSi
	
	Fin Para
	
	num = buscar
	
	
	
FinFuncion




Algoritmo sin_titulo
	definir num1 Como real
	
	escribir "Ingrese un numero para saber si es primo "
	leer num1
	
	si Primo(num1) == 2 Entonces
		
		Escribir "El numero " num1 " es primo"
		
	SiNo
		
		Escribir "El numero " num1 " no es primo"
		
	FinSi   
	
	
	
FinAlgoritmo
