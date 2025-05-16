/**
 * Represents one person receiving deferred action for childhood arrivals (DACA).
 * 
 * <TODO add @author info here for all group-mates!>
 *
 * @version 1.2
 **/

//TODO: Complete UML class diagram
/* UML CLASS DIAGRAM:
-----------------------------------------
					DACArecipient
-----------------------------------------
- surname : String
- givenName : String
- uscisNumber : String
- countryOfOrigin : String
- birthday : int
- validFromDate : int
- expirationDate : int
- sex : char
-----------------------------------------
+ getSurname() : String
+ getGivenName() : String
+ getUscisNumber() : String
+ getCountyOfOrigin() : String
+ getBirthDay() : int
+ getValidFromDate() : int
+ getExpirationDate() : int
+ getSex() : char
+ setSurname(surname : String) : void
+ setGivenName(givenName : String) : void
+ setUscisNumber(uscisNumber : String) : void
+ setCountryOfOrigin(countryOfOrigin : String) : void
+ setBirthday(birthday : int) : void
+ setValidFromDate(validFromDate : int) : void
+ setExpirationDate(expirationDate : int) : void
+ setSex(sex : char) : void
+ setAll(surname:String, givenName:String, uscisNumber:String, countryOfOrigin:String, birthday:int, validFromDate:int, expirationDate:int,sex:char) : void
+ toString() : String
+ equals(other : DACArecipient) : boolean
+ printCard() : void
+ jdnToDate(J : int) : String
-----------------------------------------
*/

public class DACArecipient
{

	public static final String DEFAULT_SURNAME = "Unkown";
	/***** INSTANCE VARIABLES *****/
  private String surname;
  private String givenName;
  private String uscisNumber;
  private String countryOfOrigin;
  private int birthday, validFromDate, expirationDate;
  private char sex;
	

	//TODO: don't forget to copy all your methods from the previous labs!

  public String getSurname() 
	{
		return this.surname;
	}
	public String getGivenName()
	{
		return this.givenName;
	}
	public String getUscisNumber()
	{
		return this.uscisNumber;
	}
	public String getCountryOfOrigin()
	{
		return this.countryOfOrigin;		
	}
	public int getBirthday()
	{
		return this.birthday;
	}
	public int getValidFromDate()
	{
		return this.validFromDate;
	}
	public int getExpirationDate()
	{
		return this.expirationDate;
	}
	public char getSex()
	{
		return this.sex;
	}


  public void setSurname(String surname) 
	{
		this.surname = surname; 
	}
	public void setGivenName(String givenName)
	{
		this.givenName = givenName; 
	}
	public void setUscisNumber(String uscisNumber)
	{
		this.uscisNumber = uscisNumber;
	}
	public void setCountryOfOrigin(String countryOfOrigin)
	{
		this.countryOfOrigin = countryOfOrigin;
	}
	public void setBirthday(int birthday)
	{
		this.birthday = birthday;
	}
	public void setValidFromDate(int validFromDate)
	{
		this.validFromDate = validFromDate;
	}
	public void setExpirationDate (int expirationDate)
	{
		this.expirationDate = expirationDate;
	}
	public void setSex (char sex)
	{
		this.sex = sex; 
	}

  public void setAll(String surname, String givenName, String uscisNumber, 
	String countryOfOrigin, int birthday, int validFromDate, int expirationDate, char sex) {
		this.surname = surname;
		this.givenName = givenName; 
		this.uscisNumber = uscisNumber;
		this.countryOfOrigin = countryOfOrigin;
		this.birthday = birthday;
		this.validFromDate = validFromDate; 
		this.expirationDate = expirationDate;
		this.sex = sex;
  }
  /**** CONSTRUCTORS ****/
  //TODO: Write the no-argument constructor and full constructor. Remember to include documentation for each method.
/**
 * Defualt Constructor sets all instance variables to defaults from lab requiremnts
 * 
 */
  public DACArecipient()
  {
    /*surname = "Unknown";
    givenName = "Unknwon"; 
    uscisNumber = "Unknown";
    countryOfOrigin = "Unkwown"; 
    birthday = "2415021 ";
    validFromDate = "2415021";
    expirationDate = "2415021";
    sex = 'X';*/

    setAll(DEFAULT_SURNAME,"Unknown","Unknown","Unknown", 2415021, 2415021, 2415021,'X');
  }

  	public DACArecipient(String surname, String givenName, String uscisNumber, 
	String countryOfOrigin, int birthday, int validFromDate, int expirationDate, char sex)
	{
		/*this.surname = surname;
		this.givenName = givenName;
		this.uscisNumber = uscisNumber;
		this.countryOfOrigin = countryOfOrigin;
		this.birthday = birthday;
		this.validFromDate = validFromDate;
		this.expirationDate = expirationDate;
		this.sex = sex;*/

		setAll(surname, givenName, uscisNumber, countryOfOrigin, birthday, validFromDate, expirationDate, sex);

	}

	/***** OTHER REQUIRED METHODS *****/
  public String toString()
  {
    return "Surname: " + surname + ", Given Name: " + givenName + ", USCIS Number: " + uscisNumber + ", Country of Origin: " + countryOfOrigin + ", Birthday: " + birthday + ", Valid From Date: " + validFromDate + ", Expiration Date: " + expirationDate + ", Sex: " + sex;
  }
}