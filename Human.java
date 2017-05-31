package Review326;

public class Human {

	private String name;
	private String birthday;
	private int birthyear;
	private int age;
	private double weight;
	private String horoscope;

	//default
Human(){
	name = null;
	birthday = null;
	birthyear = 0;
	age = 0;
	weight = 0.0;
	horoscope = null;
}
	//overload
Human(String newN, String bday, int birth, int newA, double newW, String newH){
	name = newN;
	birthday = bday;
	birthyear = birth;
	age = newA;
	weight = newW;
	horoscope = newH;
}

public String getName()
{
	return name;
}
public String getBirthday()
{
	return birthday;
}
public int getBirthyear()
{
	return birthyear;
}
public int getAge()
{
	return age;
}
public double getWeight()
{
	return weight;
}
public String getHoroscope()
{
	return horoscope;
}

public void PrintInfo()
{
	System.out.println("Name: " + this.name
			+ "\nWeight: " + this.weight
			+ "\nBirthday: " + this.birthday + "," + this.birthyear
			+ "\nHoroscope: " + this.horoscope);
}
public String toString()
{
	String s = "Name: " + this.name
			+ "\nWeight: " + this.weight
			+ "\nBirthday: " + this.birthday + "," + this.birthyear
			+ "\nHoroscope: " + this.horoscope;
	return s;
}

public boolean equals()
{
	return false;
	
}

}