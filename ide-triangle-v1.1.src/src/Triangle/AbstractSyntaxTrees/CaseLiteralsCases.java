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
public class CaseLiteralsCases extends Cases {

    public CaseLiteralsCases (Cases c1AST, Cases c2AST, SourcePosition thePosition) {
        super(thePosition);
        C1 = c1AST;
        C2 = c2AST;
    }
    
    @Override
    public Object visit(Visitor v, Object o) {
        return v.visitCaseLiteralsCases(this, o);
    }
    
    public Cases C1, C2;
}
