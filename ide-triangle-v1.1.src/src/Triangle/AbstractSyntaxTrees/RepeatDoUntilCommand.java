/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

/**
 *
 * @author Usuario
 */
public class RepeatDoUntilCommand extends Command{
    
    public RepeatDoUntilCommand(Command cAST, Expression eAST,
                SourcePosition thePosition){
        super (thePosition);
        E = eAST;
        C = cAST;
    }
    
    public Object visit(Visitor v, Object o) {
        return v.visitRepeatDoUntilCommand(this, o);
    }
    
  public Expression  E;
  public Command C;
}

