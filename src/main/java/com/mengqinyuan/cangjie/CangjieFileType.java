package com.mengqinyuan.cangjie;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import javax.swing.*;

public final class CangjieFileType extends LanguageFileType {

    public static final CangjieFileType INSTANCE = new CangjieFileType();

    private CangjieFileType() {
        super(CangjieLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "Cangjie file";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Cangjie language file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "cj";
    }

    @Override
    public Icon getIcon() {
        return CangjieIcons.FILE;
    }

}