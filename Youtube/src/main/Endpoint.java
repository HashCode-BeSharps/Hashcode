package main;

import java.util.List;

public class Endpoint {

	private Integer number;
	private Integer datacenterLat;
	private List<Tuple<Cache, Integer>> latencies;
	
	public Endpoint(Integer number, Integer datacenterLat, List<Tuple<Cache, Integer>> latencies){
		
		this.number = number;
		this.datacenterLat = datacenterLat;
		this.latencies = latencies;
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

	public List<Tuple<Cache, Integer>> getLatencies() {
		return latencies;
	}

	public void setLatencies(List<Tuple<Cache, Integer>> latencies) {
		this.latencies = latencies;
	}
	
	
	
	
	
}
