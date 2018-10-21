/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

public class VarAssignement extends Declaration {

  public VarAssignement (Identifier iAST, Expression eAST,
                         SourcePosition thePosition) {
    super (thePosition);
    I = iAST;
    E1 = eAST;
  }

  public Object visit(Visitor v, Object o) {
    return v.visitVarAssignement(this, o);
  }

  public Identifier I;
  public Expression E1;
}
