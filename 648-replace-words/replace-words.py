class TrieNode:
    def __init__(self):
        self.children = {}
        self.is_end = False

class Solution:
    def replaceWords(self, dictionary, sentence):
        # Build Trie
        root = TrieNode()
        for word in dictionary:
            node = root
            for ch in word:
                if ch not in node.children:
                    node.children[ch] = TrieNode()
                node = node.children[ch]
            node.is_end = True
        
        # Replace words
        result = []
        for word in sentence.split():
            node = root
            replacement = ""
            for ch in word:
                if ch not in node.children or node.is_end:
                    break
                node = node.children[ch]
                replacement += ch
            # If we found a root, use it; else keep original word
            if node.is_end:
                result.append(replacement)
            else:
                result.append(word)
        
        return " ".join(result)