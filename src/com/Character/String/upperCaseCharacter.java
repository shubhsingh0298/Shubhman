package com.Character.String;

public class upperCaseCharacter {

	public static void main(String[] args) {


		char arr[]= {'N','O',2,6,' ','S','o','u','n','d'};
		String s=" ";
		for(int i =0;i<arr.length;i++)
		{
			if(Character.isUpperCase(arr[i])) 
				s=s+arr[i];
			}
		System.out.println("Upper case :"+s);

		}

}
