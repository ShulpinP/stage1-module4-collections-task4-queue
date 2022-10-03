package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

public class ArrayDequeCreator extends PriorityQueue<String> {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
        ArrayDeque<Integer> result = new ArrayDeque<>();
        result.add(firstQueue.remove());
        result.add(firstQueue.remove());
        result.add(secondQueue.remove());
        result.add(secondQueue.remove());

        while (!firstQueue.isEmpty() || !secondQueue.isEmpty()) {
            playerTurn(result,firstQueue);
            playerTurn(result,secondQueue);
        }
        return result;
    }
        private void playerTurn (Deque<Integer> result, Queue<Integer> queue) {
            queue.add(result.removeLast());
            result.add(queue.remove());
            result.add(queue.remove());
        }
    }
