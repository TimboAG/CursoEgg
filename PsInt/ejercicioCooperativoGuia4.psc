Algoritmo ejercicioCooperativoGuia4

	Definir tablero, palabra  como Cadena
	definir n, posicion Como Entero
	Dimension tablero[9, 12]
	Dimension posicion[9]

	inicializarMatriz(tablero, 9, 12)
	agregarPalabra(tablero, "vector", 0)
	agregarPalabra(tablero, "matrix", 1)
	agregarPalabra(tablero, "programa", 2)
	agregarPalabra(tablero, "subprograma", 3)
	agregarPalabra(tablero, "subproceso", 4)
	agregarPalabra(tablero, "variable", 5)
	agregarPalabra(tablero, "entero", 6)
	agregarPalabra(tablero, "para", 7)
	agregarPalabra(tablero, "mientras", 8)
	
	//buscarR(tablero,posicion)
	
	acomodarPalabras(tablero)
	

	imprimirMatriz(tablero, 9, 12)
FinAlgoritmo

SubProceso inicializarMatriz(tablero, n, m)
	definir i, j como entero
	para i=0 Hasta  n-1 Hacer
		para j=0 hasta m-1 Hacer
			tablero(i,j)= "*"
		FinPara
	FinPara	
	
FinSubProceso

SubProceso imprimirMatriz(tablero, n, m)
	definir i, j como entero
	para i=0 Hasta  n-1 Hacer
		para j=0 hasta m-1 Hacer
		 escribir sin saltar " "	tablero(i,j)
	 FinPara
	 escribir " "
	FinPara	
FinSubProceso

SubProceso agregarPalabra(tablero, palabra, n)
	definir i, j como entero
	para i=0 Hasta  n Hacer
		para j=0 hasta 11 Hacer
			tablero(n,j)= Subcadena(palabra,j,j)
		FinPara
	FinPara	
FinSubProceso


//SubProceso buscarR(tablero,posicion)
//	definir i, j como entero
//	para i=0 Hasta  8 Hacer
//		para j=0 hasta 11 Hacer
//			segun tablero(i,j)
//				"R" o "r": posicion(i) = j
//			FinSegun
//		FinPara
//FinPara	
//para i=0 hasta 8 Hacer
//	escribir posicion(i) 
//FinPara
//FinSubProceso



SubProceso acomodarPalabras(tablero)
	definir i, j, posicion, resta Como Entero	
	Dimension posicion[9]
	
	
	
	
	para i=0 Hasta  8 Hacer
		para j=0 hasta 11 Hacer
			segun tablero(i,j)
				"R" o "r": posicion(i) = j
			FinSegun
		FinPara
	FinPara	
	para i=0 hasta 8 Hacer
		escribir posicion(i) 
	FinPara
	
	
	
	escribir"---------"
	
	para i=0 hasta 8 Hacer
		       		     
					
					
					si posicion(i) > 5
						resta=    posicion(i) - 5 
						para j=0 hasta resta +1  Hacer
							tablero(i,j)= " - " 
						fin para
						
						escribir resta
					SiNo
						resta=   5 - posicion(i) 
						para j=0 hasta resta  Hacer
							tablero(i,j)= " - " 
						fin para
						
						escribir resta
					FinSi
					
					
					
						
				
						
						
				
	FinPara
	
	
	
FinSubProceso
