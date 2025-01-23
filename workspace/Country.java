//this class has info on a country, including it's name, capital, language, and the file of an image with it

public class Country
{
  // add private instance variables for the name, capital, language, and image file.
  private  String name;
  private  String capital;
  private  String language;
  private  String img;

  // add constructors
  public Country(String name, String capital, String language, String img){
    this.name = name;
    this.capital = capital;
    this.language = language;
    this.img = img;
  }
  // Write accessor/get methods for each instance variable that returns it.
  public  String getName(){
    return name;
  } 
  public  String getCapital(){
    return capital;
  } 
  public  String getLanguage(){
    return language;
  } 
  public  String getImg(){
    return img;
  } 

  // This method is a toString() method that returns a concatenated String of 3 of the instance variables in a sentence like "..'s capital is .. and its primary language is ..."
 
  public String toString(){
    return name+"'s capial is "+capital+" and it's primary language is"+language+".";
  }

  
}