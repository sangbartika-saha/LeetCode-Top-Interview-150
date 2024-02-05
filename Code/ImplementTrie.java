class Node {
    Node[] children = new Node[26];
    boolean endNode = false;
}

class Trie {
    Node root;

    public Trie() {
        root = new Node();
    }

    public void insert(String word) {
        Node temp = root;
        for (int i = 0; i < word.length(); i++) {
            int childIndex = word.charAt(i) - 'a';
            if (temp.children[childIndex] == null) {
                temp.children[childIndex] = new Node();
            }
            temp = temp.children[childIndex];
        }
        temp.endNode = true;
    }

    public boolean search(String word) {
        Node temp = root;
        for (int i = 0; i < word.length(); i++) {
            int childIndex = word.charAt(i) - 'a';
            if (temp.children[childIndex] == null) {
                return false;
            }
            temp = temp.children[childIndex];
        }
        return temp.endNode;
    }

    public boolean startsWith(String prefix) {
        Node temp = root;
        for (int i = 0; i < prefix.length(); i++) {
            int childIndex = prefix.charAt(i) - 'a';
            if (temp.children[childIndex] == null) {
                return false;
            }
            temp = temp.children[childIndex];
        }
        return true;
    }
}
