import java.util.Comparator;
import java.util.PriorityQueue;

public class pq{
    public static void main(String[] args) {
        PriorityQueue<Integer> pq= new PriorityQueue<>(Comparator.naturalOrder());
        pq.add(4);
        pq.add(1);
        pq.add(3);
        pq.add(5);
        while(!pq.isEmpty()){
            System.out.println(pq.peek());
            pq.remove();
        }
    }
}