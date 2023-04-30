package com.hs.medium;

public class DesignAddAndSearchWords {
	TrieNode root;

	public DesignAddAndSearchWords() {
		root = new TrieNode();
	}

	public void addWord(String word) {
		TrieNode temp = root;
		for (char ch : word.toCharArray()) {
			if (temp.child[ch - 'a'] == null) {
				temp.child[ch - 'a'] = new TrieNode();
			}
			temp = temp.child[ch - 'a'];
		}
		temp.isWord = true;
	}

	public boolean search(String word) {
		TrieNode temp = root;
		return searchHelper(word, 0, temp);
	}

	private boolean searchHelper(String word, int index, TrieNode curr) {
		for (int i = index; i < word.length(); i++) {
			char ch = word.charAt(i);

			if (ch == '.') {
				for (TrieNode temp : curr.child) {
					if (temp != null && searchHelper(word, i + 1, temp)) {
						return true;
					}
				}
				return false;
			}

			if (curr.child[ch - 'a'] == null) {
				return false;
			}

			curr = curr.child[ch - 'a'];
		}
		return curr.isWord;
	}

	public static void main(String[] args) {
		DesignAddAndSearchWords obj = new DesignAddAndSearchWords();
		obj.addWord("bad");
		boolean result = obj.search("pad");
		System.out.println(result);
		result = obj.search("bad");
		System.out.println(result);
	}
}