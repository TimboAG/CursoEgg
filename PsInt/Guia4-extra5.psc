Algoritmo sin_titulo
	Definir frase, letra, vector Como Caracter
	Definir posicion, i, posicion2Min, posicion2Max, cont, aux, aux2 Como Entero
	Dimension vector(20)
	
	Escribir "Ingrese una frase: "
	Leer frase
	
	Para i=0 Hasta 19
		vector(i) = Subcadena(frase, i, i)
	FinPara
	
	Escribir "Ingrese una letra: "
	Leer letra
	
	
	Escribir "Ingrese una posición: "
	Leer posicion
	
	
	posicion2Min=0
	posicion2Max= 0
	
	
	Si vector(posicion) = " "
		vector(posicion) = letra
	SiNo
		
		
		
		
		para i=0 hasta posicion Hacer
			si vector(i)= " " Entonces
				posicion2Min = i
			FinSi
		FinPara
		
		escribir posicion
		
		para i=19 hasta posicion con paso -1 Hacer
			si vector(i)= " " Entonces
				posicion2Max = i
				
			FinSi
		FinPara
		
		
		
		escribir posicion2Min
		Escribir  posicion2Max
		
		aux= posicion - posicion2Min
		aux2= posicion2Max - posicion
		
		escribir aux
		Escribir  aux2
		
		si aux> aux2 Entonces
			
			Escribir "No es posible ingresar una letra (ocupado), se colocara en el espacio mas cercano (Posicion: " posicion2Max ")"
			vector(posicion2Max) = letra
		SiNo
			Escribir "No es posible ingresar una letra (ocupado), se colocara en el espacio mas cercano (Posicion: " posicion2Min ")"
			vector(posicion2Min) = letra
		FinSi
		
		
		para i=0 hasta 19 Hacer
			escribir sin saltar vector(i)
			
		FinPara
		
	fin si
FinAlgoritmo
