Descripción

Este proyecto implementa un evaluador de expresiones aritméticas en Java. Convierte expresiones en notación infija a postfija y las evalúa utilizando una estructura de datos tipo Pila.

Requisitos

Java JDK 8 o superior

NetBeans IDE

Instalación y Ejecución

1. Clonar o descargar el proyecto

Si tienes Git instalado, ejecuta:

git clone https://github.com/fmendie/evaluadorexpresiones.git

O descarga el código fuente manualmente.

2. Abrir en NetBeans

Abre NetBeans.

Ve a "File" > "Open Project".

Selecciona la carpeta del proyecto y haz clic en "Open".

3. Ejecutar el Proyecto

En la ventana Projects, haz clic derecho en el archivo Main.java.

Selecciona "Run File" o presiona Shift + F6.

Ingresa una expresión matemática en notación infija.

El programa verificará los paréntesis, convertirá la expresión a postfija y calculará el resultado.

Funcionalidades

Verificar paréntesis balanceados en la expresión.

Convertir expresiones infijas a postfijas usando una pila.

Evaluar expresiones postfijas y mostrar el resultado numérico.

Estructura del Código

BalancedParentheses.java: Verifica si los paréntesis están balanceados.

InfijaAPostfija.java: Convierte una expresión infija a postfija.

EvaluadorPostfija.java: Evalúa una expresión en notación postfija.

Main.java: Maneja la entrada del usuario y ejecuta el programa.

Notas

Se deben ingresar expresiones válidas con operadores +, -, *, /.

Si los paréntesis están desbalanceados, el programa mostrará un mensaje de error.