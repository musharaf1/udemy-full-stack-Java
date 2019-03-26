/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prac;

/**
 *
 * @author musharaf
 */
public class MathEquation {
    private double leftVal;
    private double rightVal;
    private char opCode;
    private double result;
    
    public double getResult(){return result;};
            
    public double getLeftVal(){
    return leftVal;
    }
    public void setLeftVal(double leftVal){
    this.leftVal = leftVal;
    }
     public double getRightVal(){
    return rightVal;
    }
    public void setRightVal(double rightVal){
    this.rightVal = rightVal;
    }
     public char getOpCode(){
    return opCode;
    }
    public void setOpCode(char opCode){
    this.opCode = opCode;
    }
    public MathEquation(){
    }
    public MathEquation(char opCode){
    this.opCode = opCode;
    }
    public MathEquation(char opCode, double rightVal, double leftVal){
    this(opCode);
    this.rightVal = rightVal;
    this.leftVal = leftVal;
    }
    public void execute(double leftVal, double rightVal){
    this.leftVal = leftVal;
    this.rightVal = rightVal;
    execute();
    }
    public void execute(){
     switch(opCode){
            case 'a': 
        result = leftVal + rightVal;
        break;
            case 's': 
        result = leftVal - rightVal;
        break;
            case 'm': 
        result = leftVal * rightVal;
        break;
            case 'd': 
        result = rightVal != 0.0d? leftVal / rightVal:0.0d;
        break;
    default:
    result = 0.0d;
        System.out.println("error-invalid code");
          break;}
        }
}
