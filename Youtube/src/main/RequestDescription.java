package main;

public class RequestDescription {
	
	private Video video;
	private Integer requests;
	private Integer endpoint;
	
	public RequestDescription (Video video, Integer  requests, Integer endpoint){
		
		
		this.video = video;
		this.requests = requests;
		this.endpoint = endpoint;
	}

	public Video getVideo() {
		return video;
	}

	public void setVideo(Video video) {
		this.video = video;
	}

	public Integer getRequests() {
		return requests;
	}

	public void setRequests(Integer requests) {
		this.requests = requests;
	}

	public Integer getEndpoint() {
		return endpoint;
	}

	public void setEndpoint(Integer endpoint) {
		this.endpoint = endpoint;
	}
	
	
	
	

}
