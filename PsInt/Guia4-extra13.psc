Algoritmo sin_titulo
	Definir  matriz, c, f, i, j, suma, vector Como Entero	
	Definir  aux, aux2, matriz2 Como caracter	

	c= 3	
	escribir "Ingrese la cantidad filas"
	leer f	
	Dimension matriz(f,c)
	Dimension matriz2(f,c)
	Dimension vector(3)	
	suma=0
	Para i=0 hasta f-1 Hacer
		para j=0 Hasta 1 Hacer
			escribir "Ingrese un numero"
			leer matriz(i,j)
			suma= suma + matriz(i,j)
			vector(i) = suma	
		FinPara	
		suma=0
	FinPara	
	
	Para i=0 hasta f-1 Hacer
		para j=2 Hasta 2 Hacer			
			matriz(i,j) =  vector(i)
		FinPara		
	FinPara	
//	Para i=0 hasta f-1 Hacer
//		para j=0 Hasta 2 Hacer
//			escribir sin saltar " " matriz(i,j)	
//
//		FinPara
//		escribir " " 	
//	FinPara	
	escribir " "
	escribir "---------------------------"
	Para i=0 hasta f-1 Hacer
		para j=0 Hasta 2 Hacer
			si j=0 Entonces
				
				matriz2(i,j) = ConvertirATexto(matriz(i,j)) + " + "
			SiNo
				matriz2(i,j) =  ConvertirATexto(matriz(i,j)) 
			FinSi
			
			si j=2
				matriz2(i,j) =  " = " + ConvertirATexto(matriz(i,j)) 
			FinSi
			
		FinPara	
		
	FinPara	
	
	
	Para i=0 hasta f-1 Hacer
		para j=0 Hasta 2 Hacer
			escribir sin saltar "" matriz2(i,j)				
		FinPara
		escribir " " 	
	FinPara	
	
	
FinAlgoritmo






//
