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
        //1a-begin:
        List<Integer> sourceList = new ArrayList<Integer>();
        //1a-end

        //1b-begin:
        int i = 0, n = 10; // n the number of elements to be added
        while (i < n) {
            sourceList.add(getRandomNumber(10,21));
            i++;
        }
        System.out.println(sourceList.toString());
        //1b-end

        //1c-begin:
        Map<Integer,Integer> itemMap = new HashMap<Integer,Integer>();
        Integer c;
        for (i = 0; i < sourceList.size(); i++) {
            if (itemMap.containsKey(sourceList.get(i))) {
                c = itemMap.get(sourceList.get(i));
                itemMap.remove(sourceList.get(i));
                itemMap.put(sourceList.get(i), c+1);      
            } else {
                itemMap.put(sourceList.get(i), 1);
            }
        }
        System.out.println(itemMap.toString()); //merge
        //1c-end

        // aqui gera warning pois clone retorna Object e o typecast não é considerado neste caso boa prática
        //ArrayList<Integer> copyList = (ArrayList<Integer>)sourceList.clone();
        // solução indicada é instanciar a lista cópia já iniciando com a lista original no construtor
        //1d-begin
        List<Integer> copyList = new ArrayList<Integer>(sourceList);
        //1d-end

        //1e-begin
        Collections.sort(copyList, Collections.reverseOrder());
        System.out.println(copyList.toString());
        //1e-end

        //1f-begin
        //sourceList.remove(sourceList.indexOf(Collections.max(sourceList))); //remove uma ocorrência
        sourceList.removeIf(elem -> elem == Collections.max(sourceList)); // remove todas as ocorrências do maior com função lambda
        System.out.println(sourceList.toString());
        //1f-end

        //1g-begin
        //copyList.remove(copyList.indexOf(Collections.min(copyList))); //remove uma ocorrência
        copyList.removeIf(elem -> elem == Collections.min(copyList)); // remove todas as ocorrências do maior com função lambda
        System.out.println(copyList.toString());
        //1g-end

        //1h-begin
        sourceList.addAll(copyList);
        System.out.println(sourceList.toString());
        //1h-end

        //1i-begin
        System.out.println(sourceList.size());
        //1i-end

        //1j-begin
        int sum = sourceList.stream().mapToInt(s -> s).sum();
        System.out.println(sum);
        //1j-end

        //1k-begin
        //valor medio da lista
        Integer medio = sum / sourceList.size();
        System.out.println("Valor medio: " + medio);
        Collections.replaceAll(sourceList, Collections.min(sourceList), medio);
        System.out.println(sourceList.toString());
        //1k-end

        //1l-begin
        Integer [] v = new Integer[]{1,5,10,15,20};
        List<Integer> vList = Arrays.asList(v); //precisa ser do mesmo tipo wrapper
        System.out.println(vList);
        //1l-end

        //1m-begin
        Set<String> set = new HashSet<>();
        set.add("pedro");
        set.add("pedro");
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

