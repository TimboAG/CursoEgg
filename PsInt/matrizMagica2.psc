Algoritmo Ejercicio13G4
	definir i,j,n Como Entero
	definir matriz Como Entero
	definir sumaFila1,sumaCol1,sumaFila2,SumaCol2,SumaFila3,sumaCol3,sumaDiagP,sumaDiagS Como Entero
	escribir "Ingrese el numero de filas y columnas para la matriz: "
	leer n
	Dimension matriz(n,n)
	sumaFila1=0
	sumaFila2=0
	sumaFila3=0
	sumaCol1=0
	sumaCol2=0
	sumaCol3=0
	sumaDiagP=0
	sumaDiagS=0
	Para i=0 Hasta n-1 Hacer
		para j=0 Hasta n-1 Hacer
			Escribir "Ingrese el valor del elemento,recordando que sean menores a 9, [", i, ",", j,"]" Sin Saltar
			leer matriz(i, j)
			si i>9 o j>9 Entonces
				Escribir "El numero ingresado no es valido."
			FinSi
		FinPara
	FinPara
	imprimeMatriz(matriz,n)
	para i=0 Hasta 0 Hacer
		para j=0 Hasta n-1 Hacer
			sumaFila1=sumaFila1+matriz(i,j)
		FinPara
		Escribir "La suma de la fila 1 es: ",sumaFila1, " "
	FinPara
	para i=1 Hasta 1 Hacer
		para j=0 Hasta n-1 Hacer
			sumaFila2=sumaFila2+matriz(i,j)
		FinPara
		Escribir "La suma de la fila 2 es: ",sumaFila2, " "
	FinPara
	para i=2 Hasta n-1 Hacer
		para j=0 Hasta n-1 Hacer
			sumaFila3=sumaFila3+matriz(i,j)
		FinPara
		Escribir "La suma de la fila 3 es: ",sumaFila3, " "
	FinPara
	para i=0 Hasta n-1 Hacer
		para j=0 Hasta 0 Hacer
			sumaCol1=sumacol1+matriz(i,j)
		FinPara
		Escribir "La suma de la columna 1 es: ",sumaCol1, " "
	FinPara
	para i=0 Hasta n-1 Hacer
		para j=1 Hasta 1 Hacer
			sumaCol2=sumacol2+matriz(i,j)
		FinPara
		Escribir "La suma de la columna 2 es: ", sumaCol2, " "
	FinPara
	para i=0 Hasta n-1 Hacer
		para j=2 Hasta n-1 Hacer
			sumaCol3=sumacol3+matriz(i,j)
		FinPara
		Escribir "La suma de la columna 3 es: ",sumaCol3," "
	FinPara
	para i=0 Hasta n-1 Hacer
		para j=0 Hasta n-1 Hacer
			si i=j Entonces
				sumaDiagP=sumaDiagP+matriz(i,j)
			FinSi
		FinPara
		Escribir "La suma de la diagonal principal es: ",sumaDiagP, " "
	FinPara
	Para i=0 Hasta n-1 Hacer
		Para j=0 Hasta n-1 Hacer
			Si i+j=n-1 Entonces
				sumaDiagS=sumaDiagS+ matriz(i,j)
			FinSi
		FinPara
		Escribir "La suma de la diagonal secundaria es: ",SumaDiagS," "
	FinPara
	Escribir "*Ahora verificaremos si la matriz es magica*"
	si sumaFila1=SumaFila2 y sumaFila1=sumaFila3 y sumaFila1=sumaCol1 y sumaFila1=sumaCol2 y sumaFila1=sumaCol3 y sumaFila1=sumaDiagP y sumaFila1=sumaDiagS Entonces
		Escribir "Felicidades! La matriz ingresada es magica."
	SiNo
		Escribir "La matriz ingresada no es magica."
	FinSi
FinAlgoritmo

SubProceso imprimeMatriz(matriz, N)
	Definir i, j Como Entero
	para i=0 hasta N-1 Hacer
		para j=0 hasta N-1
			Escribir matriz(i,j), " " Sin Saltar
		FinPara
		Escribir " "
	FinPara
Fin subproceso