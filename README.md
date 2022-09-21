# Laboratorio 3 CVDS
**Nombre:** Wilson Alirio Delgado Hernandez

## Ejercicio "Registraduría"
Las clases de equivalencia son:

**Edad**

**VALID**: [0,90]
**UNDERAGE** [1,17]
**INVALID_AGE** (-∞,0]
**DEAD** [90,∞)



## Ejercicio "Descuento de tarifas"


**1.** De acuerdo con lo indicado, y teniendo en cuenta que NO hay precondiciones, en qué casos se debería arrojar una excepción de tipo ExcepcionParametrosInvalidos?. Agregue esto a la especificación.\
Se debería arrojar una excepción cuando se tiene tarifaBase,diasAntelacion y edad como valores negativos. 
También en caso de que la edad sea un valor mayor a 130.

~~~
/**
calcular la tarifa de cada billete según el trayecto, la antelación 
en la que se obtiene el billete y la edad del pasajero, de acuerdo 
con la normativa 005.
@param tarifaBase valor base del vuelo
@param diasAntelacion dias de antelación del vuelo
@param edad - edad del pasajero
@throws ExcepcionParametrosInvalidos [tarifaBase<0, diasAntelacion<0, edad<0,edad>130]
**/

public long calculoTarifa(long tarifaBase, int diasAntelacion, int edad)
~~~

**2.** En la siguiente tabla enumere un conjunto de clases de equivalencia que -según usted- creen una buena división del conjunto de datos de entrada de la función anterior:


| Número | Clase de equivalencia (en lenguaje natural o matemático) | Resultado correcto / incorrecto |
| -- | -- | -- |
| 1 | **tarifaBase** < 0, **edad** < 0, **diasAntelacion** < 0 | Incorrecto por precio, días antelación,edad negativo |
| 2 | **tarifaBase** >= 0, **díasAntelacion** ≥ 0, 0 <= **edad** <= 130 | Correcto por precio, días antelación,edad válido |
| 3 | **tarifaBase** >= 0, **díasAntelacion** < 0, 0 <= **edad** <= 130 | Incorrecto por valor de días de antelación negativo |
| 4 | **tarifaBase** >= 0, **díasAntelacion** >= 0, **edad** < 0 | Incorrecto por valor de edad negativo |
| 5 | **tarifaBase** < 0, **díasAntelacion** >= 0, 0 <= **edad** <= 130 |  Incorrecto por valor de tarifa negativo |
| 6 | **tarifaBase** >= 0, **díasAntelacion** >= 0, **edad** > 130 | Incorrecto por edad inválida |



**3.** Para cada clase de equivalencia, defina un caso de prueba específico, definiendo: parámetros de entrada y resultados esperados.
Casos:

**a.**
calculoTarifa(tarifaBase=-30, diasAntelacion=10, edad=10)\
*Resultado:* inválido por tarifaBase negativo y se lanza excepción  ExcepcionParametrosInvalidos

**b.**
calculoTarifa(tarifaBase=30, diasAntelacion=10, edad=10)\
*Resultado:* válido y aplica descuento de 5% por edad

**c.**
calculoTarifa(tarifaBase=30, diasAntelacion=10, edad=80)\
*Resultado:* válido y aplica descuento de 8% por edad

**d.**
calculoTarifa(tarifaBase=30, diasAntelacion=-10, edad=80)\
*Resultado:* inválido y se lanza excepción  ExcepcionParametrosInvalidos


**e.**
calculoTarifa(tarifaBase=30, diasAntelacion=10, edad=80)\
*Resultado:* válido y aplica descuento de 8% por edad


**f.**
calculoTarifa(tarifaBase=30, diasAntelacion=80, edad=80)\
*Resultado:* válido y aplica descuento de 8% por edad y 15% por sacar el billete con antelación superior a 20 días


**g.**
calculoTarifa(tarifaBase=30, diasAntelacion=10, edad=25)\
*Resultado:* válido 


**h.**
calculoTarifa(tarifaBase=30, diasAntelacion=10, edad=-25)\
*Resultado:* inválido y  se lanza excepción  ExcepcionParametrosInvalidos

**i.**
calculoTarifa(tarifaBase=30, diasAntelacion=10, edad=350)\
*Resultado:* inválido y  se lanza excepción  ExcepcionParametrosInvalidos


**4.** A partir de las clases de equivalencia identificadas en el punto 2, identifique las condiciones límite o de frontera de las mismas.

**tarifaBase**: 0\
**diasAntelacion**: 0\
**edad**: 0 y 130

**5.** Para cada una de las condiciones de frontera anteriores, defina casos de prueba específicos.

**a.**
calculoTarifa(tarifaBase=0, diasAntelacion=10, edad=10)\
*Resultado:* válido 

**b.**
calculoTarifa(tarifaBase=30, diasAntelacion=0, edad=10)\
*Resultado:* válido

**c.**
calculoTarifa(tarifaBase=30, diasAntelacion=10, edad=0)\
*Resultado:* válido y aplica descuento de 5% por edad

**d.**
calculoTarifa(tarifaBase=30, diasAntelacion=10, edad=130)\
*Resultado:* válido y aplica descuento de 8% por edad
