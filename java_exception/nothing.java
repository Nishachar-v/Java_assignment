import java.util.*;
public class Exception{
	public static void main(String[] args){
		
		
	}
	public void Print(){
		for(int i=0; i<data.length; i++){
			if(dataSize>=i){
				System.out.println(data[i]);
			}
		}
	}
	public void getData(int po){
		try{
			System.out.println(data[po]);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}


}
