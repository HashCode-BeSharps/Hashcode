package main;

import java.util.Set;

public class Solution {

	private Set<Cache> caches;
	private Double fitness;
	
	public Solution(Set<Cache> caches){
		
		this.caches = caches;
		
		//get fitness here
	}

	public Set<Cache> getCaches() {
		return caches;
	}

	public void setCaches(Set<Cache> caches) {
		this.caches = caches;
	}

	public Double getFitness() {
		return fitness;
	}

	public void setFitness(Double fitness) {
		this.fitness = fitness;
	}
	
	
	
	
	
	
}
