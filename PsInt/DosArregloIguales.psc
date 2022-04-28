//Crear un subproceso que rellene dos arreglos de tamaño n, con números aleatorios. Después,
//	hacer una función que reciba los dos arreglos y diga si todos sus valores son iguales o no. La
//			función debe devolver el resultado de está validación, para mostrar el mensaje en el algoritmo.
//				Nota: recordar el uso de las variables de tipo lógico.

Algoritmo sin_titulo
	definir arreglo1, arreglo2, n Como Entero	
	Escribir  "Ingrese el tamaño de los arreglos"
	leer n	
	Dimension arreglo1(n)
	Dimension  arreglo2(n)	
	Llenar(arreglo1, arreglo2, n)
FinAlgoritmo

SubProceso Llenar(arreglo1, arreglo2, n)	
	definir i Como Entero
	para i= 0 Hasta n-1 con paso 1 Hacer
		arreglo1(i) = Aleatorio(1,3)
		arreglo2(i) = Aleatorio(1,3)		
		Escribir  "Arreglo 1: " arreglo1(i)
		Escribir  "Arreglo 2: " arreglo2(i)
	FinPara	
	Escribir Resultado(arreglo1, arreglo2, n)	
FinSubProceso


funcion variable1 <- Resultado(arreglo1, arreglo2, n)
	definir variable1 Como logico
	definir var como entero 	
	definir i Como Entero
	var=0
	para i= 0 Hasta n-1 con paso 1 Hacer		
		si arreglo1(i) = arreglo2(i) Entonces
			var = var +1	
		FinSi		
	FinPara	
	si var = n Entonces	
		variable1= Verdadero
	SiNo
		variable1=  falso
	FinSi	
FinFuncion
	