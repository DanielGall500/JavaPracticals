
public class Money {

 int wholeNumber;

 int decimalPart;

 boolean positive;

 char currencySymbol; 
 
 public boolean greaterThan(Money b)
 {
	 if(this.positive && !b.positive)
	 {
		 return true;
	 }
	 else if (!this.positive && b.positive) 
	 {
		 return false;
	 }
	 else if (this.wholeNumber == b.wholeNumber)
	 {	 
		 return this.decimalPart > b.decimalPart? true : false;
	 }
	 else 
	 {
		 return this.wholeNumber > b.wholeNumber? true : false;
	 }
 }
 
 Money(int whole, int dec, boolean pos, char curr)
 {
	 
	 boolean negWhole = (whole < 0),
			 invDec   = (dec < 0) || (dec > 99),
			 invCurr = curr != '$' && 
			 		   curr != '€' && 
			 		   curr != '£';	 
	 
	 if(negWhole || invDec || invCurr)
	 {
		 throw new IllegalArgumentException("Invalid Arguments");
	 }
	 else 
	 {
		 wholeNumber = whole;
		 decimalPart = dec;
		 positive = pos;
		 currencySymbol = curr;
	 }
 }
 
 public String toString()
 {
	 String str_out = "";
	 
	 if(!positive) { str_out += "-"; }

	 str_out += String.format("%c%d.%02d", currencySymbol, wholeNumber, decimalPart);
	 
	 return str_out;
 }
 
 public boolean equals(Money b)
 {
	 if (currencySymbol == b.currencySymbol
	     && wholeNumber == b.wholeNumber
	     && decimalPart == b.decimalPart
	     && positive    == b.positive)
	 {
		 return true;
	 }
	 
	 return false;
 }
 
 
 
public int getWholeNumber() {
	return wholeNumber;
}

public int getDecimalPart() {
	return decimalPart;
}

public boolean isPositive() {
	return positive;
}

public char getCurrencySymbol() {
	return currencySymbol;
}



public void setWholeNumber(int wholeNumber) {
	
	if(wholeNumber < 0)
	{
		throw new IllegalArgumentException("Error");
	}
	else
	{
		this.wholeNumber = wholeNumber;
	}
}

public void setDecimalPart(int decimalPart) {
	
	if(decimalPart < 0 || decimalPart > 99)
	{
		throw new IllegalArgumentException("Error");
	}
	else
	{
		this.decimalPart = decimalPart;
	}
}

public void setPositive(boolean positive) {
	this.positive = positive;
}

public void setCurrencySymbol(char currencySymbol) {
	
	if( currencySymbol != '$' && 
	    currencySymbol != '€' && 
	 	currencySymbol != '£')
	{
		throw new IllegalArgumentException("Error");
	}
	else 
	{
		this.currencySymbol = currencySymbol;
	}
}

public static void main(String[] args)
 {
	Money m1 = new Money(1, 1, false, '$');
	Money m2 = new Money(1, 1, true, '$');
	System.out.println(m2.greaterThan(m1));
 }

}
