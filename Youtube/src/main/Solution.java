package main;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Solution {

	private Set<Cache> caches;
	private Double fitness;
	private Map<Cache, Video>  alternatives;
	private Set<Video> allVideos;
	private Set<Endpoint> endpoints;
	private Set<RequestDescription> requests;
	
	public Solution(Set<Cache> caches, Set<Video> allVideos, Set<Endpoint> endpoints, Set<RequestDescription> requests){
		
		this.caches = caches;
		fitness = 0.0;
		alternatives = new HashMap<Cache, Video>();
		this.allVideos = allVideos;
		this.endpoints = endpoints;
		this.requests = requests;
	}

	public Set<Cache> getCaches() {
		return caches;
	}

	public void setCaches(Set<Cache> caches) {
		this.caches = caches;
	}

	public Double getFitness() {
		//fitness calculus here
		return fitness;
	}


	public Map<Cache, Video> getAlternatives() {
		Set<Cache> caches = this.caches;
		Set<Video> allVideos = this.allVideos;
		Set<Endpoint> endpoints = this.endpoints;
		Set<RequestDescription> requests = this.requests;
		
		
		Map<Cache, Video> alternatives = new HashMap<Cache, Video>();
		
		for (Cache c: caches){
			allVideos.removeAll(c.getVideos());
			for(Video v : allVideos){
				
				if(c.getLeftMemory()<v.getSize() && ){
					
					
				}
			}
			
		}
		
		
		this.alternatives=alternatives;
		return alternatives;
	}

	
	
	
	
	
	
	
	
}
