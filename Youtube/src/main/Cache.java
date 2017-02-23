package main;

public class Cache {

	private Integer memory;
	private Integer leftMemory;
	
	public Cache(Integer memory){
		
		this.memory=memory;
		leftMemory = memory;
	}

	public Integer getMemory() {
		return memory;
	}

	public void setMemory(Integer memory) {
		this.memory = memory;
	}

	public void useMemory(Integer memory){
		
		leftMemory = leftMemory-memory;
	}
	
	public Integer getLeftMemory() {
		return leftMemory;
	}
	
	
	
	
}
