package org.example;

import java.util.ArrayList;
import java.util.List;

public class Filter {
    protected int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();
        //можно пройтись по списку проверить каждый элемент и если он
        // подходит добавить его
        logger.log("Запускаем фильтрацию");
        int stakOfFilerElement = 0;
        for (int i : source) {
            if (i < treshold) {
                logger.log("Элемент \""
                        + i
                        + "\" не проходит");
            }
            if (i >= treshold) {
                logger.log("Элемент \""
                        + i
                        + "\" проходит");
                result.add(i);
                stakOfFilerElement++;
            }
        }
        logger.log("Прошло фильтр " +
                stakOfFilerElement + " элемента из "
                + source.size()
        );
        return result;
    }
}
