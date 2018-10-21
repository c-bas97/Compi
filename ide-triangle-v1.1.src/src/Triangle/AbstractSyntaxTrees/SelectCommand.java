/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

/**
 *
 * @author curso
 */
public class SelectCommand extends Command{
    
    public SelectCommand(Expression eAST, Cases casesAST, SourcePosition thePosition){
        super (thePosition);
        E = eAST;
        C = casesAST;
    }

    @Override
    public Object visit(Visitor v, Object o) {
        return v.visitSelectCommand(this, o);
    }
    
    public Expression E;
    public Cases C;
}
