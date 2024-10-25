import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;

// by Josenalde Oliveira@Oct2024
public class App {
    public static void main(String[] args) throws Exception {
        //1a-begin: Instancie um novo ArrayList de Inteiros a partir da interface List
        List<Integer> sourceList = new ArrayList<Integer>();
        //1a-end

        //1b-begin: Preencha este ArrayList com 10 números inteiros aleatórios entre 10 e 20 inclusive, ou seja, no intervalo fechado [10,20]
        int i = 0, n = 10; // n the number of elements to be added
        while (i < n) {
            sourceList.add(getRandomNumber(10,21)); // aqui o resultado inteiro do método getRandomNumber é adicionado ao ArrayList
            i++;
        }
        System.out.println(sourceList.toString()); // exibe o ArrayList com o método interno toString(), já inerente às classes Wrapper vistas em sala de aula
        //1b-end

        //1c-begin:
        Map<Integer,Integer> itemMap = new HashMap<Integer,Integer>(); // Aqui é criado um HashMap que recebe uma chave Integer e um valor Integer, ou seja, uma tupla (Int, Int)
        /* Solução 1 */
        Integer c;
        for (i = 0; i < sourceList.size(); i++) {
            if (itemMap.containsKey(sourceList.get(i))) { // Verifica se a chave atual (ou seja, o número no índice i do ArrayList) já foi incluído antes no ArrayList
                c = itemMap.get(sourceList.get(i)); // obtém o valor da chave já inserida. Por exemplo, se já apareceu uma vez, irá retornar 1 e assim por diante.
                itemMap.remove(sourceList.get(i)); // remove da lista a chave, para criar de novo a chave na linha abaixo com o novo valor de contagem. Equivale a sobreescrever a chave no HashMap
                itemMap.put(sourceList.get(i), c+1); // cria a entrada para a chave atual no HashMap com o valor de contagem (ou seja, quantas vezes está repetido) no HashMap
            } else {
                itemMap.put(sourceList.get(i), 1); // caso seja a primeira vez, seta o valor de contagem em 1
            }
        }
        /* Solução 2
        for (i = 0; i < sourceList.size(); i++) {
            itemMap.merge(sourceList.get(i), 1, (a,b)->a+b); // Da primeira vez, seta o valor 1 à chave
                                                             // Caso já exista no HashMap, executa a lambda function da seguinte forma:
                                                             // a é o valor atual da chave. b é o parâmetro 1 que colocamos como segundo parâmetro do método merge
                                                             // irá portanto somar 1 ao valor atual, para os valores duplicados
        }
         */
        System.out.println(itemMap.toString()); //merge // exibe o hashmap na tela
        //1c-end

        // aqui gera warning pois clone retorna Object e o typecast não é considerado neste caso boa prática/confiável pelo Java
        //ArrayList<Integer> copyList = (ArrayList<Integer>)sourceList.clone(); // NÃO USAR

        // solução indicada é instanciar a lista cópia já iniciando com a lista original no construtor
        //1d-begin
        List<Integer> copyList = new ArrayList<Integer>(sourceList);
        //1d-end

        //1e-begin
        Collections.sort(copyList, Collections.reverseOrder()); // método sort para ordenar. O reverseOrder() é o Comparador para descendente
        System.out.println(copyList.toString());
        //1e-end

        //1f-begin
        //sourceList.remove(sourceList.indexOf(Collections.max(sourceList))); //remove uma ocorrência
        sourceList.removeIf(elem -> elem == Collections.max(sourceList)); // remove todas as ocorrências do maior com função lambda
        System.out.println(sourceList.toString());
        //1f-end

        //1g-begin
        //copyList.remove(copyList.indexOf(Collections.min(copyList))); //remove uma ocorrência
        copyList.removeIf(elem -> elem == Collections.min(copyList)); // remove todas as ocorrências do menor com função lambda
        System.out.println(copyList.toString());
        //1g-end

        //1h-begin
        sourceList.addAll(copyList); //adiciona copyList ao final de sourceList e atualiza sourceList
        System.out.println(sourceList.toString());
        //1h-end

        //1i-begin
        System.out.println(sourceList.size()); // tamanho do ArrayList concatenado
        //1i-end

        //1j-begin
        int sum = sourceList.stream().mapToInt(s -> s).sum(); // um tipo de acumulador usando a classe Stream (fluxo) do Java
        System.out.println(sum);
        //1j-end

        //1k-begin
        //valor medio da lista
        Integer medio = sum / sourceList.size();
        System.out.println("Valor medio: " + medio);
        Collections.replaceAll(sourceList, Collections.min(sourceList), medio); // substitui todas as ocorrências do segundo parâmetro pelo terceiro
        System.out.println(sourceList.toString());
        //1k-end

        //1l-begin
        Integer [] v = new Integer[]{1,5,10,15,20}; // se for tipo primitivo int não funciona
        List<Integer> vList = Arrays.asList(v); //precisa ser do mesmo tipo wrapper
        System.out.println(vList);
        //1l-end

        //1m-begin
        Set<String> set = new HashSet<>();
        set.add("pedro");
        set.add("pedro"); // não adiciona, pois já foi adicionado o elemento pedro
        System.out.println(set.size()); // tamanho = 1, veja que não é 2, pois não permite duplicar
        System.out.println(set.toString()); //não permite duplicações
        set.add("luisa");
        System.out.println(set.toString()); //agora sim, deu certo e tem [pedro, luisa]
        // não aceita ordenação. Contudo há a interface SortedSet que já ordena a medida que são incluídos.
        //1m-end


    }

    public static int getRandomNumber(int min, int max) {
        // Math.random() retorna double, preciso typecast. A lista <Integer> aceita o tipo primitivo int
        return (int) ((Math.random() * (max - min)) + min);
    }

    
}

