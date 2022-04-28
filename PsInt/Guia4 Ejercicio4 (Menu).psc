Algoritmo sin_titulo
	Definir OPC, opc2 Como Caracter
	definir a,b,c,d,e Como real
	definir n,i, suma como entero
	
	escribir "Ingrese el tamaño de los vectores"
	leer n
	opc=""
    suma=0
	repetir  
		escribir "----------INGRESE LA OPCION ------------"
		escribir "A. Llenar Vector A"
		escribir "B. Llenar Vector B"
		escribir "C. Llenar Vector C "
		escribir "D. Llenar Vector C con la resta de los vectores B y A."
		escribir "E. Mostrar. Vector	A, B, o C."
		escribir "F - Salir"
		leer opc
		
		Segun opc
			"A" o "a":
				Dimension a(n)
				
				para i= 0 Hasta n-1 Hacer
					a(i)= Aleatorio(-100, 100) 
					escribir "El vector a en posicion " i " es " a(i)
				FinPara
				
			"B" o "b":
				Dimension b(n)
				
				para i= 0 Hasta n-1 Hacer
					b(i)= Aleatorio(-100, 100) 
					escribir  "El vector a en posicion " i " es " b(i)
				FinPara
			"C" o "c":
				suma=0
				Dimension c(n)
				
				para i= 0 Hasta n-1 Hacer
					c(i)= a(i) + b(i)
					suma = suma + c(i)
					escribir "La suma de los vectore a en posicion " i " con valor: " a(i) " mas el vector b en posicion " i " con valor: " b(i)  " es "  c(i)                  
				FinPara
				escribir "La suma total es: " suma
			"D" o "d":
				suma=0
				Dimension d(n)
				
				para i= 0 Hasta n-1 Hacer
					d(i)= b(i) - a(i)
					suma = suma - d(i)
					escribir "La resta de los vectore b en posicion " i " con valor: " b(i) " menos el vector a en posicion " i " con valor: " a(i)  " es "  d(i)              
				FinPara
				escribir "La resta total es: " suma
			"E" o "e": 
				escribir "Ingrese el vector que quiere ver A B o C"
				leer opc2
				
				Segun opc2
					"A" o "a": 
						escribir "El vector A contiene"
						para i= 0 Hasta n-1 Hacer									
							escribir "El vector a en posicion " i " contiene: " a(i)       
						FinPara
					"B" o "b":
						escribir "El vector B contiene"
						para i= 0 Hasta n-1 Hacer									
							escribir "El vector B en posicion " i " contiene: " b(i)       
						FinPara
					"C" o "c":
						escribir "El vector C contiene"
						para i= 0 Hasta n-1 Hacer									
							escribir "El vector C en posicion " i " contiene: " c(i)       
						FinPara
					De Otro Modo:
						escribir "Se ingreso un vector no existente"
				FinSegun
				
			"F" o "f": 
				escribir "Eligio salir"
				
			DE otro modo:
				escribir "se ingreso una letra que no es correcta"
				
		FinSegun
		Hasta Que opc= "F" o opc= "f" 
FinAlgoritmo


//
//Realizar un programa con el siguiente menú y le pregunte al usuario que quiere hacer hasta
//que ingrese la opción Salir:
//	A. Llenar Vector A. Este vector es de tamaño N y se debe llenar de manera aleatoria
//	usando la función Aleatorio(valorMin, valorMax) de PseInt.
//	B. Llenar Vector B. Este vector también es de tamaño N y se llena de manera aleatoria.
//	C. Llenar Vector C con la suma de los vectores A y B. La suma se debe realizar elemento
//a elemento. Ejemplo: C = A + B
//	D. Llenar Vector C con la resta de los vectores B y A. La resta se debe realizar elemento a
//elemento. Ejemplo: C = B - A
//E. Mostrar. Esta opción debe permitir al usuario decidir qué vector quiere mostrar: Vector
//	A, B, o C.
//	F. Salir.
//NOTA: El rango de los números aleatorios para los Vectores será de [-100 a 100]. La longitud
//		para todos los vectores debe ser la misma, por lo tanto, esa información sólo se solicitará una
//vez.