package com.epam.collections.queue;

import java.util.*;


public class PriorityQueueCreator {
    public PriorityQueue<String> createPriorityQueue(List<String> firstList, List<String> secondList) {
        PriorityQueue<String> result = new PriorityQueue<>(Collections.reverseOrder());
        for (String str : firstList) {
            result.offer(str);
        }
        for (String str : secondList) {
            result.offer(str);
        }

        return result;
    }
}


