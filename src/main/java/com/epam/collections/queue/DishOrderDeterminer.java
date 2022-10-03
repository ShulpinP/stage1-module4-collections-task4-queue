package com.epam.collections.queue;

import java.util.LinkedList;
import java.util.List;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        LinkedList<Integer> queue = new LinkedList<>();
        LinkedList<Integer> result = new LinkedList<>();
        for (int i = 1;i<=numberOfDishes;i++) {
            queue.add(i);
        }
        int count = 1;
        while (!queue.isEmpty()) {

            if (count % everyDishNumberToEat != 0){
                queue.offer(queue.poll());
            }
            else {
                result.add(queue.poll());
            }
            count++;
        }
        return result;

    }
}
