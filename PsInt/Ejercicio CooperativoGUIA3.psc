Algoritmo sin_titulo
	Menu()
FinAlgoritmo

SubProceso Menu()
	definir num Como Entero
	escribir "Ingrese el numero "
	escribir "-------------------------------------"
	escribir "1 - Calcular muro de ladrillo"
	escribir "2 - Calcular viga de hormigón"
	escribir "3 - Calcular columnas de hormigón"
	escribir "4 - Calcular contrapisos"
	escribir "5 - Calcular techo"
	escribir "6 - Calcular pisos"
	escribir "7 - Calcular pintura"
	escribir "8 - Calcular iluminación"
	escribir "9 - Salir"
	leer num
	Segun num hacer
		1: calcularMuro()
		2: calcularViga()
		3: calcularColumna()
		4: calcularContrapisos()
		5: calcularTecho()
		6: calcularPisos()
		7: calcularPintura()
		8: calcularIluminacion()
		9:  Escribir " Elgio Salir " 
		De Otro Modo:
			escribir "No se eligio un numero correcto"
	FinSegun
	
	
FinSubProceso

funcion variable1 <- calcularSuperficie(largo,alto)
	definir variable1 Como Real
	variable1 = largo * alto	
FinFuncion


Funcion variable1 <-  calcularVolumen(espesor, ancho, largo)	
	definir variable1 Como Real
	variable1 = espesor *  ancho * largo
FinFuncion
	


SubProceso  calcularMuro()
	
	escribir "---------CALCULO MURO ------------"
	definir espesor, largo, alto, auxiliar Como real
	
	escribir "muro será de 20 o 30 cm de espesor? Elegir el numero "	
	leer espesor
	
	escribir "Ingrese largo "
	leer largo
	escribir "Ingrese alto "
	leer alto
	
	escribir "La superficie es: " calcularSuperficie(largo,alto)

	si espesor = 30 Entonces		
		auxiliar= calcularSuperficie(largo,alto)
		escribir "Cantidad de materiales que se necesitan: " auxiliar * 15.2 " de cemento, "  0.115*auxiliar ", metros cubicos de arena " auxiliar * 120 ", ladrillos "
	SiNo		
		si espesor = 20 Entonces
			auxiliar= calcularSuperficie(largo,alto)
			escribir "Cantidad de materiales que se necesitan: " auxiliar * 10.9 " de cemento, "  0.09*auxiliar ", metros cubicos de arena " auxiliar * 90 ", ladrillos "
		SiNo
			escribir "Se ingreso un numero invalido "
		FinSi
	FinSi
	Menu()
FinSubProceso

SubProceso  calcularViga()
	escribir "---------CALCULO VIGA ------------"
	Definir largoV Como Real
	escribir "ingrese largo de la viga."
	leer largoV	
	escribir "Se necesita " largoV * 9 " de cemento, "  0.02*largoV ", metros cubicos de arena " largoV * 0.02 ", metros cuadrado de piedra " largoV* 4 "m de hierro del 8 " largoV* 3 "m de hierro del 4."
	Menu()
FinSubProceso

SubProceso  calcularColumna()
	escribir "---------CALCULO COLUMNA ------------"
	Definir largoC Como Real
	escribir "ingrese largo de la viga."
	leer largoC	
	escribir "Se necesita " largoC* 7.5 " de cemento, "  0.016*largoC ", metros cubicos de arena " largoC * 0.016 ", metros cuadrado de piedra " largoC* 6 "m de hierro del 10 " largoC* 3 "m de hierro del 4."
	Menu()
FinSubProceso

SubProceso calcularContrapisos()
	escribir "---------CALCULO CONTRA PISO ------------"
	Definir  espesor, ancho, largo, auxiliar Como Real
	escribir "ingrese espesor"
	leer espesor
	escribir "ingrese ancho"
	leer ancho
	escribir "ingrese largo"
	leer largo
	auxiliar= calcularVolumen(espesor, ancho, largo)
	escribir "El volumen es: " calcularVolumen(espesor, ancho, largo)
	escribir "Se necesita " auxiliar* 105 " de cemento, "  0.45*auxiliar ", metros cubicos de arena " auxiliar * 0.9 ", metros cuadrado de piedra " 
	Menu()

FinSubProceso

SubProceso calcularTecho()
	escribir "---------CALCULO TECHO ------------"
	Definir  espesor, ancho, largo, auxiliar Como Real
	escribir "ingrese espesor"
	leer espesor
	escribir "ingrese ancho"
	leer ancho
	escribir "ingrese largo"
	leer largo
	auxiliar= calcularVolumen(espesor, ancho, largo)
	escribir "El volumen es: " calcularVolumen(espesor, ancho, largo)
	escribir "Se necesita " auxiliar* 33 " de cemento, "  0.072*auxiliar ", metros cubicos de arena " auxiliar * 0.072 ", metros cuadrado de piedra " auxiliar* 7 "m de hierro del 8 " auxiliar* 4 "m de hierro del 6."
	Menu()
FinSubProceso

SubProceso calcularPisos()
	escribir "---------CALCULO PISOS ------------"
	definir ancho, largo, auxiliar Como Real
	Escribir "Ingrese ancho y largo del paño de piso a colocar."
	leer ancho, largo
	auxiliar = calcularSuperficie(largo,ancho) * 1.10
	escribir "La superficie total es : " auxiliar "m cuadrados"
	Menu()
FinSubProceso

SubProceso calcularPintura()
	escribir "---------CALCULO PINTURAS ------------"
	definir  largo, alto, auxiliar Como real
	escribir "Ingrese largo "
	leer largo
	escribir "Ingrese alto "
	leer alto
	
	escribir "La superficie es: " calcularSuperficie(largo,alto)
    auxiliar =  calcularSuperficie(largo,alto)
	Escribir "Se necesitaran aproximadamente ",0.165*auxiliar," litros de pintura."
	Menu()
FinSubProceso

SubProceso calcularIluminacion()
	escribir "---------CALCULO PINTURAS ------------"
	definir  largo, alto, auxiliar Como real
	escribir "Ingrese largo "
	leer largo
	escribir "Ingrese alto "
	leer alto
	auxiliar=calcularSuperficie(largo,alto)
	
	escribir "La superficie es: " calcularSuperficie(largo,alto)
	Escribir "la cantidad mínima de superficie de iluminación natural (ventanas y puertas de vidrio) es:" auxiliar * 0.20
	Menu()
FinSubProceso

SubCadena(cadena,desde,hasta)
	