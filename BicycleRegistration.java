public class BicycleRegistration
{
public static void main(String[] args){
Bicycle bike_1, bike_2, bike1, bike2;
String tag1, tag2, owner1, owner2; 

bike1=new Bicycle();
bike1.setOwnerName("Christine Joy Estacion");
bike2=new Bicycle();
bike2.setOwnerName("Jennie Kim"); 

bike_1=new Bicycle();
bike_1.settagNo("2003-345L");
bike_2=new Bicycle();
bike_2.settagNo("1996-116J");


owner1=bike1.getOwnerName();
owner2=bike2.getOwnerName(); 

tag1=bike_1.gettagNo();
tag2=bike_2.gettagNo(); 

System.out.println(owner1+" owns a Bicycle with a tag number: "+tag1 );
System.out.println(owner2+" also owns a Bicycle with a tag number: "+tag2);
}
}
