# Introduction To Object Oriented Programming

Build a Animal Class 
 - color, age, name.  

We would want to create a few objects and play with them 
- Understand concepts of Class, Object, State, Behavior
- Understand basics of Encapsulation and Abstraction


## Procedural/Structured Programming

- Thinking in terms of procedures/methods/functions

```
    //Global Data

 fly(){
  trvaleToAirport();
  findEntryGate();
  findCheckInCounter();
  checkIn();
  securityCheck();
  waitForBoardingCall();
  boardTheFlight();
  takeOff();
  landing();
}

```

## Object Oriented Programming

- Thinking about Objects
  - Class, Object
    - Data (state)
    - Actions (behaviour)

Aeroplane
- airline, make, type, position //data
- takeoff(), land(), cruise() //actions
   

    
Passenger
- name, address //data
- takeCab(), checkin(), walk(), smile() //actions

## Object Oriented Terminology

```
class Animal {

	private String name; // data (state)
	private int age;
	private String color;

	Animal() {
		System.out.println("Animal Constructor...");
	}

	Animal(String name, int age, String color) {
		this.name = name;
		this.age = age;
		this.color = color;
	}

```

```
Animal cat = new Animal();
Animal dog = new Animal();
```

Terminology
- Class - Template ex : Animal, Person, Employee
- Objects/Instances - ex : cat, dog, employee1
- Member Data/State/Fields - Data present in each object - name, color, age
- Actions/Methods/Behaviour - What actions can be performed on each object?


#### Animal
 
 - name, age, color 
 - bark(), walk(), run(), sleep(), eat(), drink()
 
### Abstraction and Inheritance
	
```
		abstract class Animal {
	
		private String color;
		private int age;
	
		abstract void bark();
	
		public void run() {
	
			System.out.println("running...");
		}
	
		}
		
		class Cat extends Animal { // cat is a animal
		
			public void bark() {
		
				System.out.println("Meow Meow");
			}
		
		}
		
		class Dog extends Animal {
		
			public void bark() {
		
				System.out.println("Bow Bow");
			}
		
		}

```
