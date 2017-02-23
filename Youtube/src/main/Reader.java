package main;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Reader {

	
	private Path path;
	
	public Reader(Path path){
		this.path = path;
	}
	
	public Path getPath() {
		return path;
	}
	public void setPath(Path path) {
		this.path = path;
	}
		public List<String> read(){
			
			List<String> result = null;
			try{
				result = Files.lines(path, Charset.forName("UTF-8")).collect(Collectors.toList());
			}catch(IOException e){
				e.printStackTrace();;
			}
			
			
			
			return result;
		}
		
		
	
}
