package week3.day1;

public abstract class DogsBehavior implements DogBreeds {
public void bark() {
	System.out.println("Dog Barks");
}
public void bite() {
	System.out.println("Dog Bites");
}

public void breed() {
	System.out.println("Its German Shepherd");
}
public void eat() {
	System.out.println("Dog Eats");
}
public void chase() {
	System.out.println("Dog chases Cat");
}


}
