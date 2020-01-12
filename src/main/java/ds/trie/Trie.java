package ds.trie;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/1/12
 */

public class Trie {

    private TrieNode root = new TrieNode('/');

    public void insert(char[] text) {
        TrieNode p = root;
        for (char c : text) {
            int index = c - 'a';
            if (p.children[index] == null) {
                TrieNode newNode = new TrieNode(c);
                p.children[index] = newNode;
            }
            p = p.children[index];
        }
        p.isEndingChar = true;
    }

    public boolean find(char[] pattern) {
        TrieNode p = root;
        for (char c : pattern) {
            int index = c - 'a';
            if (p.children[index] == null) {
                return false;
            }
            p = p.children[index];
        }
        return p.isEndingChar;
    }


    public static class TrieNode {

        public char data;

        public TrieNode[] children = new TrieNode[26];

        public boolean isEndingChar = false;

        public TrieNode(char data) {
            this.data = data;
        }

    }

}
