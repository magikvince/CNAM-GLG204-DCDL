package fr.magikvince.dcdl.game.solution;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "T_SOLUTION_DETAIL")
public class SolutionDetail {
	
	@Id
	private int idSolutionDetail;
	
	@ManyToOne
	@JoinColumn(name="id_solution_fk")
	private Solution solution;
	private int number1;
	private int number2;
	
	@Transient
	private Operation operation;
	
	private String operationAsText;
	
	//order in global solution
	private int order;
	private int result;
	
	public SolutionDetail()
	{
		
	}

	public int getNumber1() {
		return number1;
	}

	public void setNumber1(int number1) {
		this.number1 = number1;
	}

	public int getNumber2() {
		return number2;
	}

	public void setNumber2(int number2) {
		this.number2 = number2;
	}

	public Operation getOperation() {
		return operation;
	}

	public void setOperation(Operation operation) {
		this.operation = operation;
	}
	
	public String getOperationAsText() {
		return operationAsText;
	}

	public void setOperationAsText(String operationAsText) {
		this.operationAsText = operationAsText;
	}

	public int getOrder() {
		return order;
	}

	public void setOrder(int order) {
		this.order = order;
	}

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}
	
}
