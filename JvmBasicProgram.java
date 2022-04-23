// Devolope a programe in java to implement all consept like static variable non static verable.....
class JvmBasicProgram {
	//to create  static variable 
static int a=10;
static int b=20;
//non static ver
int x=30;
int y=40;
//static block
static{
System.out.println("static block :");
}//end of the syatic block
// non static block 
	{
	System.out.println(" non staic block : ");
	}//end of the block

	//constracture 
JvmBasicProgram() {
System.out.println("  non param constrouctor :");
}//end of the constractor
//non param constract 
JvmBasicProgram (int x,int y){
this.x=x;
this.y=y;
System.out.println("param constractor ");

}//end  of the non param constractor

//static mathod 
static void  m1(){
System.out.println("m1 method :");

}//end of the static  method

//non static method 
int  m2(int x){
	this.x=x;
System.out.println("m2 method :");
return x;
}//end of the non static method 

	public static void main(String[] args) {
	
System.out.println("Start of  main method");
JvmBasicProgram  s1=new JvmBasicProgram();
System.out.println();
JvmBasicProgram  s2=new JvmBasicProgram (12,90);

int p=10;
s1.m1();
s2.m2(12);
s2.m2(p);
A.m3(s1);
B.m4(s2);
C.m5(p);

System.out.println("End  of the main method  ");
		//System.out.println("Hello World!");
	}//end of the main method 
}//end of the class
class A{
	static void m3(JvmBasicProgram  s1){
	System.out.println(" m3 method " +s1);
	}
}//end of the class A

class B{
static void m4(JvmBasicProgram  s2){
System.out.println("m4 method "+s2);
}//end of the method m4
}//end of the class B

class C{
static void m5(int p){
System.out.println("m5  method "+p);
}//end of the method m4
}//end of the  class C