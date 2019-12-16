package piggyBank;

import java.util.*;

public class AddValue {

    public static double sum(ArrayList<Money> list) {
        double sum = 0;
        for (Money i : list) {
            sum += i.getValue();
        }
        return sum;
    }
}