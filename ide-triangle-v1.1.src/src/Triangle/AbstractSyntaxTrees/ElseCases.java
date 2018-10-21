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
public class ElseCases extends Cases{
    
    public ElseCases (Command c, SourcePosition thePosition) {
        super(thePosition);
        C = c;
    }

    @Override
    public Object visit(Visitor v, Object o) {
        return v.visitElseCases(this, o);
    }
    
    public Command C;
}
