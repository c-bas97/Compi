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
public class CasesCases extends Cases {
    
    public CasesCases (Cases c1, Cases c2, SourcePosition thePosition) {
        super (thePosition);
        C1 = c1;
        C2 = c2;
    }
    
    @Override
    public Object visit(Visitor v, Object o) {
        return v.visitCasesCases(this, o);
    }
    
    public Cases C1,C2;
}
