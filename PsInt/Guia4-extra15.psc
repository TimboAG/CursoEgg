Algoritmo sin_titulo
	
	definir ventas, i, j, suma, max, max1, max2 Como entero
	definir  productos, varios Como caracter
	
	
	
	
	Dimension ventas[7,7];
	//Dimension varios[5,5];
	Dimension max1[6];
	Dimension productos[7]
	productos[0]= "Prodcuto 1:"
	productos[1]= "Prodcuto 2:"
	productos[2]= "Prodcuto 3:"
	productos[3]= "Prodcuto 4:"
	productos[4]= "Prodcuto 5:"
	productos[5]= "Total semana:"
	productos[6]= "Producto más vendido:"
	
	suma=0
	max=0
	
	Para i = 0 Hasta 6 Hacer
		para j = 0 Hasta 6 Hacer
			ventas[i, j] = 0
		FinPara
	FinPara
	
	
	
	Para i<-0 Hasta 5-1 Con Paso 1 Hacer
		Para j<-0 Hasta 5-1 Con Paso 1 Hacer
			ventas(i,j) = Aleatorio(1,9)
		Fin Para
	Fin Para

	
	Para i = 0 Hasta 4 Hacer
		para j = 0 Hasta 5 Hacer
			Si j <> 5 Entonces
				ventas(i, 5) = ventas(i, 5) + ventas(i, j)
			FinSi			
			ventas(5, j) = ventas(5, j) + ventas(i, j)
			
		FinPara
	FinPara
	
	
	
	

	Para i = 0 Hasta 5 Hacer		
		para j = 0 Hasta 4 Hacer
			Si ventas(j, i) > max   Entonces
				max= ventas(j, i)				
			FinSi				
		FinPara
		max1(i) = max
		ventas(6, j) = max	
		//escribir ventas(6, j)
		max=0	
	FinPara
	
	
		para j = 0 Hasta 4 Hacer
			ventas(6,j) = max1(j)		   
		FinPara

	
	
	
	
	
	escribir "            L               M               M               J               V              Total productos"
	
	escribir " ---------------------------------------------------------------------------------------------------------------"
	
	Para i<-0 Hasta 6 Con Paso 1 Hacer
		escribir productos[i]
		Para j<-0 Hasta 5 Con Paso 1 Hacer
			escribir sin saltar "            "  ventas(i,j) "   "		
			
		Fin Para
		escribir " "
	Fin Para

	
	
FinAlgoritmo