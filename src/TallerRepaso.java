import java.util.Random;
import java.util.Scanner;

public class TallerRepaso {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.println("***Menu***");
        System.out.println("1.verificarNumero: ");
        System.out.println("2. Determinar si es mayor de edad: ");
        System.out.println("3. Suma de numeros: ");
        System.out.println("4. conteo de intentos de numero secreto: ");
        System.out.println("5. Ingresar numeros: ");
        System.out.println("6. Sistema de calificaciones: ");
        System.out.println();
        int opcion = Integer.parseInt(consola.nextLine());
        switch (opcion) {
            case 1:
                // Verificar si un numero es positivo, negativo o cero
                System.out.println("Digite un numero: ");
                int numero = Integer.parseInt(consola.nextLine());
                if (numero > 0)
                {
                    System.out.println("El numero es positivo");
                }
                else if (numero < 0)
                {
                    System.out.println("El numero es negativo");
                }
                else if (numero == 0)
                {
                    System.out.println("El numero es Cero");
                }
                else
                {
                    System.out.println("Dato no valido");
                }
                break;
            case 2:
                // Determinar si una persona es mayor de edad
                System.out.println("Ingrese su edad: ");
                int edad = Integer.parseInt(consola.nextLine());
                if (edad > 18)
                {
                    System.out.println("Es mayor de edad");
                }
                else
                {
                    System.out.println("Es menor de edad");
                }
                break;
            case 3:
                // Sumar numeros hasta que el usuario diga "Salir"
                int suma = 0;
                System.out.println("Suma de numeros (escriba 'salir' para terminar");
                while (true)
                {
                    System.out.println("ingrese un numero o salir");
                    if (consola.hasNextInt())
                    {
                    int numero = Integer.parseInt(consola.nextLine());
                    suma += numero;
                        System.out.println("Numero añadido: " + numero);
                        System.out.println("Suma actual: " + suma);
                    }
                    else
                    {
                        String entrada = consola.nextLine();
                        if (entrada.equalsIgnoreCase("Salir"));
                        {

                        }
                break;
            case 4:
                // Conteo de intentos numeros aleatorios
                Random random = new Random();
                int numeroRandom = random.nextInt(100) + 1;
                int intentos = 0;
                int intentoUsuario;
                System.out.println("Bienvenido al juego de adivinar el número");
                System.out.println("He generado un número entre 1 y 100. Intenta adivinarlo");
                do {
                    System.out.print("Ingresa tu intento: ");
                    intentoUsuario = consola.nextInt();
                    intentos++;
                    if (intentoUsuario < numeroRandom)
                    {
                        System.out.println("El número secreto es MAYOR que " + intentoUsuario);
                    } else if (intentoUsuario > numeroRandom)
                    {
                        System.out.println("El número secreto es MENOR que " + intentoUsuario);
                    } else {
                        System.out.println("¡Felicidades! Adivinaste el número aleatorio: " + numeroRandom);
                        System.out.println("Número de intentos: " + intentos);
                    }
                } while (intentoUsuario != numeroRandom);

                break;
            case 5:
                //Numeros en orden inverso
                int[] numeros = new int[5];
                System.out.println("Ingrese 5 números: ");
                for (int i = 0; i < numeros.length; i++) {
                    System.out.print("Número " + (i + 1) + ": ");
                    numeros[i] = consola.nextInt();
                }
                System.out.println("\nLos números en orden inverso son:");
                for (int i = numeros.length - 1; i >= 0; i--) {
                    System.out.println(numeros[i]);
                    break;
            case 6:
                // Sistema de calificaciones
                System.out.print("Ingrese la cantidad de estudiantes: ");
                int cantidad = consola.nextInt();

                double[] notas = new double[cantidad];

                double suma = 0;
                double mayor = 0;
                double menor = 5;

                for (int i = 0; i < cantidad; i++) {
                    System.out.print("Ingrese la nota del estudiante " + (i + 1) + ": ");
                    notas[i] = consola.nextDouble();

                    suma = suma + notas[i];

                    if (notas[i] > mayor) {
                        mayor = notas[i];
                    }

                    if (notas[i] < menor) {
                        menor = notas[i];
                    }
                }

                System.out.println("\nResultados:");
                for (int i = 0; i < cantidad; i++) {
                    if (notas[i] >= 3) {
                        System.out.println("Estudiante " + (i + 1) + ": " + notas[i] + " → Aprobó");
                    } else {
                        System.out.println("Estudiante " + (i + 1) + ": " + notas[i] + " → Reprobó");
                    }
                }

                double promedio = (double) suma / cantidad;

                System.out.println("\nEstadísticas:");
                System.out.println("Promedio: " + promedio);
                System.out.println("Mayor nota: " + mayor);
                System.out.println("Menor nota: " + menor);
        }
    }
                break;
            default:
                System.out.println("Codigo no valido");
                break;
        }


    }
}
