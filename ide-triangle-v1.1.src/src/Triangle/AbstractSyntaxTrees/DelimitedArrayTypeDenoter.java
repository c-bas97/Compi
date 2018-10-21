/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

public class DelimitedArrayTypeDenoter extends TypeDenoter{
    
    public DelimitedArrayTypeDenoter (IntegerLiteral il1AST, 
          IntegerLiteral il2AST, TypeDenoter tAST, SourcePosition thePosition){
        super (thePosition);
        IL1 = il1AST;
        IL2 = il2AST;
        T = tAST;
    }
    
    public Object visit(Visitor v, Object o) {
        return v.visitDelimitedArrayTypeDenoter(this, o);
    }
    
    public boolean equals (Object obj) {
        return true;
    }
    
    public IntegerLiteral IL1, IL2;
    public TypeDenoter T;
    
}
