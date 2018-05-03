package chapter09.ReplaceNestedConditionalwithGuardClauses;

public class Test2 {
	public static void main(String[] args) {
		boolean special1=true,special2=false,special3=true;
		int price=0;
		if(special1) price=1;
		if(special2) price=2;
		if(special3) price=3;
		price=100;
	}
}
