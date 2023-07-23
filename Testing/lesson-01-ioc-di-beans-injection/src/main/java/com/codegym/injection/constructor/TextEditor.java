package com.codegym.injection.constructor;

public class TextEditor {

    private SpellChecker spellChecker;
    private HieuTiger hieuTiger;

    public TextEditor(SpellChecker spellChecker, HieuTiger hieuTiger) {
        this.spellChecker = spellChecker;
        this.hieuTiger = hieuTiger;
    }

    public void spellCheck() {
        spellChecker.checkSpelling();
    }
}
