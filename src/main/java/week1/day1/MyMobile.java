package week1.day1;

public class MyMobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
// to call another class inside main class	
		//Syntax: class name referencename = new classname()
		//syntax to call method of a class
		//refernceName.methodName()
Mobile mymob = new Mobile();
mymob.switchOff();
String getcolor = mymob.getcolor("Wife");
System.out.println("getcolor: "+getcolor);

String getColor =mymob.getColor("Motorola");
System.out.println("getColor:"+getColor);

System.out.println(mymob.getMsg());
System.out.println(mymob.getNumber());


//variable reference
// syntax: referncename.variablename (cntrl+2 then release and press L)
String mobileName = mymob.mobileName;
System.out.println(mobileName);
int number = mymob.getNumber();
System.out.println(number);
/*mymob.getcolor(whom);*/
	}

}
