import java.util.*;
public class wrapper_class{
	public static void main(String[] arg){
	Scanner sc = new Scanner(System.in);
	class car<T, K , P>{
		private T car_name;
		private K car_id;
		private P car_data;
		public car(T t, K k, P p){
			this.car_name = t;
			this.car_id = k;
			this.car_data = p;

		}
		public T getcar_name(){
			return this.car_name;
		}
		public K getcar_id(){
			return this.car_id;
		}
		public P getcar_data(){
			return this.car_data;
		}
	}
	}
}


