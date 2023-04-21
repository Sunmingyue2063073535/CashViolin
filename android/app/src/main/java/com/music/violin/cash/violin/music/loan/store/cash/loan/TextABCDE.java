package com.music.violin.cash.violin.music.loan.store.cash.loan;

public class TextABCDE {
    static final class HashEntry<K,V> {
        final K key;                       // 声明 key 为 final 型
        final int hash;                   // 声明 hash 值为 final 型
        volatile V value;                 // 声明 value 为 volatile 型
        final HashEntry<K,V> next;      // 声明 next 为 final 型

        HashEntry(K key, int hash, HashEntry<K,V> next, V value) {
            this.key = key;
            this.hash = hash;
            this.next = next;
            this.value = value;
        }
    }
}
