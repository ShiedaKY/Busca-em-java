package atividade01;

/*ANALISAR TEMPO DE BUSCAS COM NANOTIME (ANTES E DEPOIS) */
public class BrincandoComBusca {
    public static void main(String[] args) {
        int tamanho = 10000;
        int num = 1;
        Busca b = new Busca();
        int[] numeros = b.geraVetorNumericoOrdenado(tamanho);
        long i = System.nanoTime();

        System.out.println("Busca Linear Iterativa:");
        System.out.println("PRIMEIRA BUSCA:");
        System.out.println((System.nanoTime()-i)/1000000000.0);
        b.buscaLinear_iterativa(numeros,num);
        System.out.println(b.buscaLinear_iterativa(numeros,num));
        System.out.println("SEGUNDA BUSCA:");
        System.out.println((System.nanoTime() - i)/1000000000.0);
        
        System.out.println("Busca Linear Recursiva:");
        System.out.println("PRIMEIRA BUSCA:");
        System.out.println((System.nanoTime()-i)/1000000000.0);
        b.buscaLinear_recursiva(numeros,num);
        System.out.println(b.buscaLinear_recursiva(numeros,num));
        System.out.println("SEGUNDA BUSCA:");
        System.out.println((System.nanoTime() - i)/1000000000.0);
        
        System.out.println("Busca Binaria Iterativa:");
        System.out.println("PRIMEIRA BUSCA:");
        System.out.println((System.nanoTime()-i)/1000000000.0);
        b.buscaBinaria_iterativa(numeros,num);
        System.out.println(b.buscaBinaria_iterativa(numeros,num));
        System.out.println("SEGUNDA BUSCA:");
        System.out.println((System.nanoTime() - i)/1000000000.0);
        
        System.out.println("Busca Binaria Recursiva:");
        System.out.println("PRIMEIRA BUSCA:");
        System.out.println((System.nanoTime()-i)/1000000000.0);
        b.buscaBinaria_recursiva(numeros,num);
        System.out.println(b.buscaBinaria_recursiva(numeros,num));
        System.out.println("SEGUNDA BUSCA:");
        System.out.println((System.nanoTime() - i)/1000000000.0);
    }
}
