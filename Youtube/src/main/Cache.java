package main;

import java.util.HashSet;
import java.util.Set;

public class Cache {

	private Integer number;
	private Integer memory;
	private Integer leftMemory;
	private Set<Video> videos;
	private Set<Endpoint> endpoints;
	
	public Cache(Integer number, Integer memory){
		
		this.number=number;
		this.memory=memory;
		leftMemory = memory;
		videos = new HashSet<Video>();
		setEndpoints(new HashSet<Endpoint>());
	}

	
	public Set<Endpoint> getEndpoints() {
		return endpoints;
	}


	public void setEndpoints(Set<Endpoint> endpoints) {
		this.endpoints = endpoints;
	}


	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
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
	
	public void removeMemory(Integer memory){
		
		leftMemory = leftMemory+memory;
	}
	
	public Integer getLeftMemory() {
		return leftMemory;
	}
	
	public Set<Video> getVideos(){
		
		return videos;
	}
	
	public void addVideo(Video video){
		
		videos.add(video);
		this.useMemory(video.getSize());
	}
	
	public void removeVideo(Video video){
		
		videos.remove(video);
		this.removeMemory(video.getSize());
	}
	
	public void addEndpoint(Endpoint endpoint){
		
		endpoints.add(endpoint);
	}
	
	public void removeEndpoint(Video video){
		
		videos.remove(video);
	}
	
	
	
	
}
