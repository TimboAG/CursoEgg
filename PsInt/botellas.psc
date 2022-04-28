Algoritmo sin_titulo
	definir usuario Como Caracter
	Definir contrasena Como Caracter
	Definir  Login Como Logico
	definir intentos Como Entero
	definir opciones como entero
	definir saldo Como Real
	Definir cantBotellas Como Entero
	Definir  i Como Entero
	definir numAzar Como Entero
	definir siOno Como Caracter
	
	usuario = ""
	contrasena = ""
	Login = falso
	intentos = 1
	opciones = 0
	saldo = 0
	cantBotellas = 0
	
	Escribir  "Ingrese su usuario"
	leer usuario
	
	
	
	Mientras usuario <>  "Albus_D"
		Escribir  "Usuario invalido. Ingrese su usuario"
		leer usuario
	FinMientras
	
	
	
	
	si usuario = "Albus_D" Entonces
		
		
		
		
		Escribir "--------------------------------"
		Escribir  "Ingrese su contraseña"
		leer contrasena
		
		
		
		
		Mientras contrasena <>  "caramelosDeLimon" y intentos < 3
			
			Escribir "--------------------------------"
			Escribir  "Contraseña incorrecta ingrese nuevamente su contraseña " 
			leer contrasena
			
			
			
		
			
			intentos = intentos +1
			
		FinMientras
		
		
		
		
		
		
		si intentos = 3 Entonces
			Escribir "--------------------------------"
			escribir "Se superaron los limites de intentos"
		FinSi
		
		
		
		
		
		si contrasena = "caramelosDeLimon" Entonces				
			Login = Verdadero		
			
			
			
			
			Repetir
				
				escribir "--------- MENU --------"
				
				Escribir "Ingrese el numero de la opcion que desea seleccionar"
				escribir "1- Ingresar botellas"
				Escribir "2- Consultar saldo" 
				escribir "3- Salir"
				Leer opciones
				
				
				Segun opciones Hacer
					
					1: Escribir "--------------Ingresar botellas------------------"
						escribir "Ingrese cantidad de botellas"
						leer cantBotellas
						
						Para i = 1  Hasta cantBotellas Con Paso 1 Hacer
						
							numAzar = Aleatorio(100, 3000) 
							escribir "Botella " i " pesa " numAzar " gr "
							
							si numAzar < 500 Entonces
								
								escribir "El saldo que se le acreditara es: $50"
								escribir "Desea continuar? Ingrese S o N"
								leer siOno
								
								
								si siOno = "S" o  siOno = "s" Entonces
									saldo= saldo + 50
									
								SiNo
									si  siOno = "N" o  siOno = "n" Entonces
										Escribir "Devolviendo material"

									SiNo
										si siOno <> "N" o siOno <> "S" o siOno <> "n" o siOno <> "s" Entonces
											Escribir "Elegiste una opcion incorrecta"
										FinSi
									FinSi
								FinSi
							
								
						
							SiNo
								si numAzar > 500 y numAzar < 1500 Entonces
									escribir "El saldo que se le acreditara es: $125"
									
									escribir "Desea continuar? Ingrese S o N"
									leer siOno
									
									
									si siOno = "S" o  siOno = "s" Entonces
										saldo= saldo + 125
										
									SiNo
										si  siOno = "N" o  siOno = "n" Entonces
											Escribir "Devolviendo material"

										SiNo
											si siOno <> "N" o siOno <> "S" Entonces
												Escribir "Elegiste una opcion incorrecta"
											FinSi
										FinSi
									FinSi
									
									
									
									
									
									
								SiNo
									si numAzar > 1501 Entonces
										escribir "El saldo que se le acreditara es: $200"
										
										
										
										escribir "Desea continuar? Ingrese S o N"
										leer siOno
										
										
										si siOno = "S" o  siOno = "s" Entonces
											saldo = saldo + 200
											
										SiNo
											si siOno = "N" o  siOno = "n"  Entonces
												Escribir "Devolviendo material"

											SiNo
												si siOno <> "N" o siOno <> "S" Entonces
													Escribir "Elegiste una opcion incorrecta"
												FinSi
											FinSi
										FinSi
										
										
										
									FinSi
								FinSi
							FinSi
							
							
							
						Fin Para
						
						
						
					2: escribir "Su saldo es: $" saldo
						3: escribir "Usted Salio del sistema"
						
					De Otro Modo:
						escribir "Numero de opcion ingresada no valida"
				Fin Segun
				
				
				
				
				
			Mientras Que opciones <> 3
			
			
			
			
			
			
			
			
			
		FinSi
		
		
	FinSi
	
FinAlgoritmo
