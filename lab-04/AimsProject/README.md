## Question in `1`
	* You will create a new method that has the same name but with different type of parameter. addDigitalVideoDisc(DigitalVideoDisc [] dvdList)
	* This method will add a list of DVDs to the current cart
	Try to add a method `addDigitalVideoDisc` which allows to pass an arbitrary number of arguments for dvd. Compare to an array parameter. What do you prefer in this case?

- The method which allows to pass an arbitrary number of arguments is called Variable Argument (Varargs) method. The varags allows the method to accept zero or 
		muliple arguments. Before varargs either we use overloaded method or take an array as the method parameter but it was not considered good because it leads to 
		the maintenance problem. If we don't know how many argument we will have to pass in the method, varargs is the better approach.
- This varargs method is convenient than passing array parameter because we don’t have to create an array of DigitalVideoDisc in the main function but the method 
		creates an array of parameters of unspecified length in the background and such a parameter can be treated as an array in runtime. Length of the array is limited 
		while varargs is not and it easier to manage the object passed in the method. 
## Question in `2.Passing parameter`:
    Is JAVA a Pass by Value or a Pass by Reference programming language?

`Answer:`  JAVA is always a pass by value programming language. The method parameter values are copied to another variable and then the copied object is passed to the method.
* To test whether a programming language is passing by value or passing by reference, we usually use the `swap` method (in TestPassingParameter.java)
```java
package aims;

public class TestPassingParameter {
	public static void main(String[] args) {
		DigitalVideoDisc jungleDVD = new DigitalVideoDisc("jungle");
		DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("cinderellaDVD");
		
		swap(jungleDVD, cinderellaDVD);
		System.out.println("jungle DVD title: "+ jungleDVD.getTitle());
		System.out.println("cinderella DVD title: " + cinderellaDVD.getTitle());

        changeTitle(jungleDVD, cinderellaDVD.getTitle());
		System.out.println("jungle dvd title: " + jungleDVD.getTitle());
	}
	public static void swap(Object o1, Object o2) {
		Object tmp = o1;
		o1 = o2;
		o2 = tmp;
	}

    public static void changeTitle(DigitalVideoDisc dvd, String title) {
		String oldTitle = dvd.getTitle();
		dvd.setTitle(title);
		dvd = new DigitalVideoDisc(oldTitle);
	}
}
*Result*
jungle DVD title: jungle
cinderella DVD title: cinderellaDVD
jungle dvd title: cinderellaDVD
```
*  It’s clear that `swap` method didn’t worked. This is because Java is pass by value.
### Question * *After the call of `swap(jungleDVD, cinderellaDVD)` why does the title of these two objects still remain?*

`Answer:` Notice that we are changing values of o1 and o2 but they are copies of “jungleDVD” and “cinderellaDVD” reference **locations**, so actually there is no change in the values of “jungleDVD” and “cinderellaDVD” and hence the output.
### Question * *After the call of `changeTitle(jungleDVD, cinderellaDVD.getTitle())` why is the title of the JungleDVD changed?*

`Answer:` The first line is the important one, when we call a method the method is called on the Object at the reference location.
### Write a swap() method that can correctly swap the two objects. (in TestPassingParameter.java)
```java
	public static void swap(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
		String temp = dvd1.getTitle();
		dvd1.setTitle(dvd2.getTitle());
		dvd2.setTitle(temp);
	}
*Result*
jungle DVD title: cinderellaDVD
cinderella DVD title: jungle
```
## Question in `6.Open the Cart class`
	Suggestion: Write a getDetail() method for the DigitalVideoDisc class. What should be the return type of this method?

`Answer:` `getDetail()` method return a string which includes information of disc. When calling System.out.println(dvd.getDetail()); The program will print out that information.
