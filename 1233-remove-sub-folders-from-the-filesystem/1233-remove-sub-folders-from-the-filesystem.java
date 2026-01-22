class Solution {
   class TrieNode {
        Map<String, TrieNode> children = new HashMap<>();
        boolean isEnd = false;
    }

    class Trie {
        TrieNode root = new TrieNode();

        public boolean insert(String path) {
            TrieNode node = root;
            String[] parts = path.split("/");

            for (String part : parts) {
                if (part.isEmpty()) continue;

                if (node.isEnd) {
                    return false; // sub-folder found
                }

                node.children.putIfAbsent(part, new TrieNode());
                node = node.children.get(part);
            }

            node.isEnd = true;
            return true;
        }
    }

    public List<String> removeSubfolders(String[] folder) {
        Arrays.sort(folder); // lexicographical sort

        Trie trie = new Trie();
        List<String> result = new ArrayList<>();

        for (String f : folder) {
            if (trie.insert(f)) {
                result.add(f);
            }
        }

        return result;
    }
}