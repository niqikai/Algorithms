package edu.encu.fundamentals.union_find;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class UF {
    private int[] id;
    private int count;

    public UF (int N) {
        count = N;
        id = new int[N];
        for (int i = 0; i < N; i++) { id[i] = i; }

    }

    boolean connected(int p, int q) { return find(p) == find(q); }

    void union (int p, int q) { }

    void quickUnion (int p, int q) {
        int pid = find(p);
        int qid = find(q);
        if (pid == qid) return;

        for (int i = 0; i < id.length; i++) {
            if (id[i] == pid ) id[i] = qid;
        }
        count--;
    }

    int find(int p) { return id[p]; }

    int count() {return count;}

    public static void main(String[] args) {
        int N = StdIn.readInt();
        UF uf = new UF(N);
        while (!StdIn.isEmpty()) {
            int p = StdIn.readInt();
            int q = StdIn.readInt();
            if (uf.connected(p, q)) continue;
            uf.union(p, q);
            StdOut.println(p + " " + q);
        }
        StdOut.println(uf.count() + "components");
    }
}
