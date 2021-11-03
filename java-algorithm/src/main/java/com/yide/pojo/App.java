package com.yide.pojo;

class Trie{
    Trie[] children;
    boolean isEnd;

    Trie(){
        children = new Trie[26];
        isEnd = false;
    }

    private Trie searchStr(String str){
        Trie node = this;
        for(int i=0; i<str.length(); i++){
            int index = str.charAt(i)-'a';
            if(node.children[index] == null){
                return null;
            }
            node = node.children[index];
        }
        return node;
    }

    public void insert(String str){
        Trie node = this;
        for(int i=0; i<str.length(); i++){
            int index = str.charAt(i)-'a';
            if(node.children[index] == null){
                node.children[index] = new Trie();
            }
            node = node.children[index];
        }
        node.isEnd = true;
    }

    public boolean search(String words){
        Trie node = this.searchStr(words);
        return node.isEnd && node != null;
    }

    public boolean searchPre(String prefix){
        Trie node = this.searchStr(prefix);
        return node!=null;
    }
}

public class App{
    public static void main(String[] args){
        Trie dictTrie = new Trie();

        // System.out.println(dictTrie.insert("IamYide"));
        dictTrie.insert("iamyide");

        System.out.println(dictTrie.search("iamyide"));

        System.out.println(dictTrie.searchPre("iam"));

        System.out.println(dictTrie.searchPre("iamch"));

    }
}