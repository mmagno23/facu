import java.util.*;
import java.util.HashMap;
public class Cadastro {
    public static void main(String[] args) {
        HashMap< Integer, String> pessoa = new HashMap<>();
        pessoa.put(1, "Maria da Silva");
        pessoa.put(2, "João Carlos");
        pessoa.put(3, "José Lima");
        pessoa.put(4, null );
        pessoa.put(5, "Patricia Oliveira");
        pessoa.put(6, "Catarina Souza");
        // todos os valores de pessoa
        System.out.println("Lista de usuarios cadastrados");
        for(Map.Entry<Integer, String> entry : pessoa.entrySet()){
           
            System.out.println("Numero do Cadastros "+entry.getKey()+" Nome do Benificiario "+entry.getValue());
        }
        System.out.println("----------------------------------------------------");
        // monstra a quantodade coleção pessoa
        System.out.println("Quantidades de elementos tem minha coleção "+pessoa.size()); 
        System.out.println("----------------------------------------------------");
        // monstrta apenas um valor da coleção
        System.out.println("Cadastro solicitado é de "+pessoa.get(1));
        
        // atualiza o valor da chave 1
        String antigo = pessoa.replace(1, "Teresa da Silva");
        System.out.println("----------------------------------------------------");
        // imprime o valor atualizado da chave 1
        System.out.println("Cadastro atualizado com sucesso "+pessoa.get(1));
        System.out.println("----------------------------------------------------");
        // remover
        String removido = pessoa.remove(2);
        System.out.println("Cadastro removido com sucesso "+removido);
        System.out.println("----------------------------------------------------");
               
        // verificar de existe valor null na coleção pessoa
        for(Map.Entry<Integer, String> entry : pessoa.entrySet()){
            if(entry.getValue() == null){
                System.out.println("Valor null encontrado no numero do cadastro  "+entry.getKey());
            }
        }
        // Coleção atualizada
        System.out.println("----------------------------------------------------");
        System.out.println("Cadastro atualizado");
        for(Map.Entry<Integer, String> entry : pessoa.entrySet()){
         System.out.println("Numero do Cadastros "+entry.getKey()+" Nome do Benificiario "+entry.getValue());
        }
        
        

        
        


    }
}