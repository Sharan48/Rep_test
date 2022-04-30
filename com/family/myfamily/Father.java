package com.family.myfamily;

public class Father {
private void atm()
{
	System.out.println("atm");
}
void car()
{
	System.out.println("car");
}
protected void bike()
{
	System.out.println("bike");
}
public void cycle()
{
	System.out.println("cycle");
}
public static void main(String[] args) {
	Father n=new Father();
	n.atm();
	n.bike();
	n.car();
	n.cycle();
}
}
