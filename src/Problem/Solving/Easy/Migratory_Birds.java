package Problem.Solving.Easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Migratory_Birds {

    // Complete the migratoryBirds function below.
    static int migratoryBirds(List<Integer> arr) {
        // return arr.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
        //                                    .entrySet()
        //                                    .stream()
        //                                    .sorted(Map.Entry.<Integer, Long>comparingByValue().reversed())
        //                                    .findFirst()
        //                                    .get()
        //                                    .getKey();
        // Or:
        List<Integer> distinct = arr.stream()
                .distinct()
                .collect(Collectors.toList());
        Collections.sort(distinct);
        Collections.sort(arr);
        ArrayList resArr = new ArrayList();
        int bigger = 0;
        for (int i = 0; i < distinct.size(); i++) {
            int count = 0;
            for (int j = 0; j < arr.size(); j++) {
                if (distinct.get(i) == arr.get(j)) count++;
            }
            if (count > bigger) {
                bigger = count;
            }
            if (count == bigger) {
                resArr.add(distinct.get(i));
            }
        }
        Collections.sort(resArr);
        return (int) resArr.get(2);
    }
}
