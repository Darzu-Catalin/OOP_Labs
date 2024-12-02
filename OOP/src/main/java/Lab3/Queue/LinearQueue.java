package Lab3.Queue;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class LinearQueue<T> implements Queue<T> {
    private final ArrayList<T> queue = new ArrayList<>();

    @Override
    public void enqueue(T element) {
        queue.add(element);
    }

    public T dequeue() {
      if(isEmpty()){
          throw new NoSuchElementException("Queue is empty");
      }
      return queue.removeFirst();
    }

    @Override
    public boolean isEmpty() {
        return queue.isEmpty();
    }
    @Override
    public int size() {
        return queue.size();
    }
}
