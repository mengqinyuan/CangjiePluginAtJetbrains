package com.mengqinyuan.cangjie.psi;

import com.intellij.psi.tree.IElementType;
import com.mengqinyuan.cangjie.CangjieLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class CangjieElementType extends IElementType {

    public CangjieElementType(@NotNull @NonNls String debugName) {
        super(debugName, CangjieLanguage.INSTANCE);
    }

}