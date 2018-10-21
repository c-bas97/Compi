/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

public class RepeatForCommand extends Command{
    
    public RepeatForCommand(DeclarationRFC dec, Expression e2AST, Command cAST, SourcePosition thePosition){
    super (thePosition);
    D = dec;
    E = e2AST;
    C = cAST;
    }

    public Object visit(Visitor v, Object o) {
        return v.visitRepeatForCommand(this, o);
    }
    
  public Expression E;
  public Command C;
  public Declaration D;
}
