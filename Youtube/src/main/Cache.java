package main;

import java.util.HashSet;
import java.util.Set;

public class Cache {

	private Integer memory;
	private Integer leftMemory;
	private Set<Video> videos;
	
	public Cache(Integer memory){
		
		this.memory=memory;
		leftMemory = memory;
		videos = new HashSet<Video>();
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
	
	public Set<Video> getVideos(){
		
		return videos;
	}
	
	public void addVideo(Video video){
		
		videos.add(video);
	}
	
	public void removeVideo(Video video){
		
		videos.remove(video);
	}
	
	
	
}
