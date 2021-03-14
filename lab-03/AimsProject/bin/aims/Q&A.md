## Question:
    If you create a constructor method to build a DVD by title then create a constructor method to build a DVD by category.
    Does JAVA allow you to do this?

`Answer:` No, since JAVA won't know that the user created a constructor method to build a DVD by category or title. 
*   It will report an error of Duplicate method of DigitalVideoDisc(String) in type DigitalVideoDisc.
*   Because both Title and Category are String field, if we call DigitalVideoDisc("A_String") for a string, the program can't distinguish whether the string is a name or a category.