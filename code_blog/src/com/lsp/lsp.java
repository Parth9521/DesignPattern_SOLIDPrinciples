package com.lsp;

public class lsp {

    public static void main(String[] args) {
        Father f = new Son();
        Son s = new Son();
        f.reduction("reduction");
        s.reduction("reduction");

        f.enlarge("enlarge");
        s.enlarge("enlarge");
    }

}
