package com.mengqinyuan.cangjie;

// com.mengqinyuan.cangjie.CangjieLanguage.java

import com.intellij.lang.Language;


public class CangjieLanguage extends Language {
    public static final CangjieLanguage INSTANCE = new CangjieLanguage();

    private CangjieLanguage() {
        super("Cangjie");
    }
}
