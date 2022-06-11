package sets_hashSet_LinkedHashSet;

import java.util.Objects;

public class Animal {
 String name;
 int age;
 
public Animal(String name, int age) {
	super();
	this.name = name;
	this.age = age;
}

@Override
public String toString() {
	return "Animal [name=" + name + ", age=" + age + "]";
}


//Using hashcode and equals does a field by field comparison to come out with unique value. (needed when comparing HashSet)
//insures uniqueness in user defined objects
@Override
public int hashCode() {
	return Objects.hash(age, name);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Animal other = (Animal) obj;
	return age == other.age && Objects.equals(name, other.name);
}
 
}
