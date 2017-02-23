package main;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class FileGenerator {

	//Generador de archivos
	public void generateResult(Path path){
		//Crea el reader
		Reader reader = new Reader(path);
		List<String> inputs;
		String[] params;
		int nVideos;
		int nEndpoints;
		int nRequests;
		int nCaches;
		int capacity;
		List<Video> videos = new ArrayList<Video>();
		List<Endpoint> endpoints = new ArrayList<Endpoint>();
		List<RequestDescription> requests = new ArrayList<RequestDescription>();
		List<Cache> caches = new ArrayList<Cache>();
		
		// This integer is the one used to go through the file.
		
		int iterator = 0;
		
		
		inputs = reader.read();
		
		//Reads the principal parameters of the system
		params = inputs.get(iterator).split(" ");
		
		

		nVideos = new Integer(params[0]);
		nEndpoints = new Integer(params[1]);
		nRequests = new Integer(params[2]);
		nCaches = new Integer(params[3]);
		capacity = new Integer(params[4]);
		
		
		// Create the list of caches
		for (int i = 0; i < nCaches; i++){
			Cache cache = new Cache(i, capacity);
			caches.add(cache);
		}
		
		// Loads All videos into memory
		iterator++;
		params = inputs.get(iterator).split(" ");
		
		for(int i = 0; i < nVideos; i++){
			int size = new Integer(params[i]);
			Video video = new Video(i, size);
			videos.add(video);
		}
		
	
		
		//We have arrived now to the endpoints
		
		
		for(int i = 0; i < nEndpoints; i++){  // The i is the Endpoint number or "id"
			iterator ++ ;
			params = inputs.get(iterator).split(" ");  // Reads the line regarding that Endpoint specification
			int eLatency = new Integer(params[0]);
			int eCaches = new Integer(params[1]);
			Endpoint endpoint = new Endpoint(i , eLatency);
			for(int e = 0; e < eCaches; e++){
				iterator ++;
				params = inputs.get(iterator).split(" ");  // Reads the line regarding the associated caches and the latency associated to it
				int eCache = new Integer(params[0]);
				int latency = new Integer(params[1]);
				Cache related = caches.get(eCache);
				related.addEndpoint(endpoint);
				Tuple<Cache, Integer> cLatency = new Tuple<Cache, Integer>(related, latency);
				endpoint.getLatencies().add(cLatency);
			}
			endpoints.add(endpoint);
		}
		
		for(int i = 0; i < nRequests; i++){
			iterator++;
			Video video;
			int nrequests;
			Endpoint endpoint;
			params = inputs.get(iterator).split(" ");  // Reads the line regarding Request specification
			int videoNumber = new Integer(params[0]);
			int endpointNumber = new Integer(params[1]);
			nrequests = new Integer(params[2]);
			video = videos.get(videoNumber);
			endpoint = endpoints.get(endpointNumber);
			RequestDescription request = new RequestDescription(video, nrequests, endpoint);
			requests.add(request);
			
		}
				
				
		//TODO Crear el problem a partir de las listas de objetos
		
		
		
		
		
	}
	
}
