package InvalidException;
/*
 * Unchecked Exception
 * */
public class InvalidAgeException  extends RuntimeException{
	public InvalidAgeException(){
		super();
	}
	public InvalidAgeException(String s){
		super(s);
	}
}
