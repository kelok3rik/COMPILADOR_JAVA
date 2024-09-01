# Compilador Español-Java

## Descripción
El Compilador Español-Java es una herramienta que traduce un lenguaje similar al español a código fuente en Java. Su objetivo es facilitar la programación a usuarios que prefieren una sintaxis en español, proporcionando un puente entre el lenguaje natural y el lenguaje de programación.

## Funcionalidades
- Análisis Léxico: Descompone el código en tokens básicos.
- Análisis Sintáctico: Verifica la estructura gramatical y construye un árbol de sintaxis abstracta.
- Análisis Semántico: Evalúa el significado del código para asegurar coherencia.
- Generación de Código Java: Traduce el lenguaje intermedio a código Java.
- Manejo de Errores: Ofrece mensajes claros para la corrección de errores.
- Optimización de Código: Mejora la eficiencia del código generado.

# Requisitos
- Java JDK 11 o superior: Para compilar y ejecutar el compilador.
- Antlr 4.9: Herramienta para generación de analizadores léxicos y sintácticos.
- JavaCC: Alternativa para generación de analizadores.



## Ejemplos
Código en Español:

    función saludo()

        imprimir "Hola, Mundo"
    fin


Código Java Generado:


    public class Main {
        public static void main(String[] args) {
            System.out.println("Hola, Mundo");
        }
    }

## Contribuciones
Las contribuciones son bienvenidas. Para contribuir:

Haz un Fork del Repositorio



Asegúrate de que tu código pase las pruebas antes de enviar el pull request.

## Licencia
Este proyecto está licenciado bajo la Licencia MIT. Consulta el archivo LICENSE para más detalles.
