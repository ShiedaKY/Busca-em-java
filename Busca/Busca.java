package atividade01;

public class Busca {
    
    public int[] geraVetorNumericoOrdenado(int tamanho){
        int[] numeros = new int[tamanho];
        for(int i = 0; i < tamanho; i++ ) {
            numeros[i] = i;
            //System.out.println(i+1);
        }
        return numeros;
    }
    
    public boolean buscaLinear_iterativa(int[] numeros, int num){
        for(int i = 0; i < numeros.length-1; i++){
            if(numeros[i] == num){
                return true;
            }   
        }
        return false;
    }

    public boolean buscaLinear_recursiva(int[] numeros, int num){
        return buscaLinear_recursiva(numeros,num,0);
     }
    
    private boolean buscaLinear_recursiva(int[] numeros,int num,int i){
        if(i > numeros.length-1){
            return false;
        }
        if(numeros[i] == num){
            return true;
        }
        return buscaLinear_recursiva(numeros,num,i+1);
    }
    
    public boolean buscaBinaria_iterativa(int[] numeros, int num){
        int ini = 0;
        int meio = num/2;
        int fim = numeros.length-1;
        if(num<0){
            return false;
        }
        while (ini <= fim) {   
            meio = (ini + fim)/2;  
            if (num == numeros[meio])   
                     return true;   
            if (num < numeros[meio])   
                     fim = meio - 1;   
            else   
                     ini = meio + 1;   
        }  
        return false;
    }

    public boolean buscaBinaria_recursiva(int[] numeros, int num){
        return buscaBinaria_recursiva(numeros,num,0,numeros.length-1);
    }

    private boolean buscaBinaria_recursiva(int[] numeros, int num,int ini,int fim){
        if(ini>fim){
            return false;
        }
        int meio = (ini + fim)/2;
        if(numeros[meio] == num){
            return true;
        } 
        if(numeros[meio] > num){
            return buscaBinaria_recursiva(numeros,num,ini,meio-1);
        } 
        else{
            return buscaBinaria_recursiva(numeros,num,meio+1,fim);
        } 
    }
}
