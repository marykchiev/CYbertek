package Day44;

public class MathEquation {
	private double operand1;
	private double operand2;
	private double result;
	private char operator;
	
	
	public double getOperand1() {
		return operand1;
	}
	public void setOperand1(double operand1) {
		this.operand1 = operand1;
	}
	public double getOperand2() {
		return operand2;
	}
	public void setOperand2(double operand2) {
		this.operand2 = operand2;
	}
	public double getResult() {
		return result;
	}
	public void setResult(double result) {
		this.result = result;
	}
	
	public char getOperator() {
		return operator;
	}
	public MathEquation(double operand1, double operand2, char operator) {
		
		this.operand1 = operand1;
		this.operand2 = operand2;
		this.operator=operator;
	}
	
	public void calculate() {
		if(this.operator=='+')
			this.result=this.operand1+this.operand2;
		else if(operator=='-')
			result=operand1-operand2;
		else if(operator=='*')
			result=operand1*operand2;
		else if(operator=='/')
			result=this.operand1/operand2;
		else
			System.out.println("invalid");
		
	}
	
	
	public String toString() {
		return "MathEquation [operand1=" + operand1 + ", operand2=" + operand2 + ", result=" + result + ", operator="
				+ operator + "]";
	}
	
	
	
	
	

}
