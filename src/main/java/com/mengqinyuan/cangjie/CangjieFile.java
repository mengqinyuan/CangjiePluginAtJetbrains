package com.mengqinyuan.cangjie;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import org.jetbrains.annotations.NotNull;

public class CangjieFile extends PsiFileBase {

    public CangjieFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, CangjieLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return CangjieFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "Cangjie File";
    }

}