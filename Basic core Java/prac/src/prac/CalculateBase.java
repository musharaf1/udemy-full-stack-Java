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
public abstract class CalculateBase {
    private double leftVal;
    private double rightVal;
    private double result;
    
    
     public double getResult(){return result;};
     public void setResult(double result){this.result = result;}
            
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
    public CalculateBase(){}
     
    public CalculateBase(double rightVal, double leftVal){
    this.rightVal = rightVal;
    this.leftVal = leftVal;
    }
    public abstract void calculate();
    
}
