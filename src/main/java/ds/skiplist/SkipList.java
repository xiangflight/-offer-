package ds.skiplist;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/11/27
 */

public class SkipList {

    private static final float SKIP_LIST_P = 0.5f;
    private static final int MAX_LEVEL = 16;

    private int levelCount = 1;

    private Node head = new Node();

    public Node find(int value) {

    }

    private static class Node {
        private int data = -1;
        private Node[] forwards = new Node[MAX_LEVEL];
        private int maxLevel = 0;

        @Override
        public String toString() {
            StringBuilder builder = new StringBuilder();
            builder.append("{ data: ");
            builder.append(data);
            builder.append("; level: ");
            builder.append(maxLevel);
            builder.append(" }");
            return builder.toString();
        }
    }

}
