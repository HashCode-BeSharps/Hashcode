package main;

import java.util.HashSet;
import java.util.Set;

public class Endpoint {

	private Integer number;
	private Integer datacenterLat;
	private Set<Tuple<Cache, Integer>> latencies;
	
	public Endpoint(Integer number, Integer datacenterLat){
		
		this.number = number;
		this.datacenterLat = datacenterLat;
		latencies = new HashSet<Tuple<Cache, Integer>>();
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Integer getDatacenterLat() {
		return datacenterLat;
	}

	public void setDatacenterLat(Integer datacenterLat) {
		this.datacenterLat = datacenterLat;
	}

	public Set<Tuple<Cache, Integer>> getLatencies() {
		return latencies;
	}


	public void addLatency(Tuple<Cache, Integer> latency){
		
		latencies.add(latency);
	}
	
	
	
	
	
}
