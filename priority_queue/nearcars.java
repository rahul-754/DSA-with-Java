import java.util.*;

public class nearcars {
    static class Point implements Comparable<Point> {
        int x;
        int y;
        int d;
        int idx;

        public Point(int x, int y, int d, int idx) {
            this.x = x;
            this.y = y;
            this.d = d;
            this.idx = idx;
        }

        @Override
        public int compareTo(Point p2) {
            return this.d - p2.d;
        }
    }

    public static void main(String[] args) {
        int pts[][] = { { 3, 3 }, { 5, -1 }, { -2, 4 } };
        int k = 2;
        PriorityQueue<Point> pq = new PriorityQueue<>();
        for (int i = 0; i < pts.length; i++) {
            int d = pts[i][0] * pts[i][0] + pts[i][1] * pts[i][1];
            pq.add(new Point(pts[i][0], pts[i][1], d, i));
        }
        for (int i = 0; i < k; i++) {
            System.out.println("C" + pq.remove().idx);
        }
    }
}
