Funcion buscar <- Sumar(letra,frase)
	definir buscar Como entero
	definir i Como Entero
	Definir aux Como entero
	aux=0
	
	Para i=0 Hasta Longitud(frase) Con Paso 1 Hacer
		
		si Subcadena(frase, i, i) = letra Entonces			
			aux= aux + 1
		FinSi
				
	Fin Para
	
	buscar = aux
FinFuncion




Algoritmo sin_titulo
	definir frase, letra Como caracter
	
	escribir "Ingrese una frase"
	leer frase
	escribir "Ingrese la letra que queremos buscar en la frase"
	leer letra
	
	si Longitud(letra) =1 Entonces
		escribir "La ingresada aparece  " Sumar(letra,frase) " veces"
	SiNo
		Escribir "La letra a buscar no corresponde a una sola letra"
	FinSi
	

	
	
FinAlgoritmo
