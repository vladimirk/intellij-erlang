// This is a generated file. Not intended for manual editing.
package org.intellij.erlang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface ErlangListComprehension extends ErlangExpression {

  @NotNull
  ErlangArgumentDefinition getArgumentDefinition();

  @NotNull
  List<ErlangExpression> getExpressionList();

}
