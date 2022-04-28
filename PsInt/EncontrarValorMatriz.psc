Algoritmo sin_titulo
	definir nombre_matriz, num,  i, j como entero
	definir variable Como Caracter
	dimension nombre_matriz(5,5)
	
	variable = ""
	Para i<-0 Hasta 4 Con Paso 1 Hacer
		Para j<-0 hasta 4 Con Paso 1 Hacer
			nombre_matriz(i,j) = Aleatorio(1,100)
			//escribir "Fila:" i ", Columna: " j ", valor: " nombre_matriz(i,j)
		Fin Para
	Fin Para
	
	
		escribir "Ingrese un numero entero del 1-100 que desea buscar: "
		leer num
		
		Para i<-0 Hasta 4 Con Paso 1 Hacer
			Para j<-0 hasta 4 Con Paso 1 Hacer
				
				si nombre_matriz(i,j) = num Entonces
					variable =  "Fila: " +  ConvertirATexto(i) + " Columna " +  ConvertirATexto(j) +  " valor "  + ConvertirATexto( nombre_matriz(i,j) )
               fin si		
				
			Fin Para			
		Fin Para
		
		si variable = "" Entonces
			escribir "No se encontro el valor dentro de la matriz "		
		SiNo
			escribir variable
		FinSi
		
		
FinAlgoritmo
