/*
 * This is the BeerSong class used to make a
 * constructor and other methods that will make
 * outputting the beer bottle song easier.
 */
package beerbottlesong;

/**
 *
 * @author jeff
 */
public class BeerSong {
    private int bottleNumber;
    
    public BeerSong()
    {
        bottleNumber = 0;
    }
    
    public BeerSong(int bottle)
    {
        setNumber(bottle);
    }
    
    public void setNumber(int number)
    {
        if(number <= 0)
            bottleNumber = 0;
        else if(number >= 99)
            bottleNumber = 99;
        else
            bottleNumber = number;
    }
    
    public String toString()
    {
        return (bottleNumber + ": bottles of beer.\n");
    }
   
    public boolean printSong()
    {
        while(bottleNumber > 0)
        {
            System.out.println(beerString(bottleNumber) + " bottles of beer on the wall.\n" + beerString(bottleNumber) + " bottles of beer."
                + "\nTake one down, pass it around\n" + beerString((bottleNumber - 1)) + " bottles of beer on the wall.\n");
             bottleNumber--;
        }
        return true;
    }
    
    private String beerString(int beerNumber)
    {
        switch(beerNumber)
        {
            case 99:
                return "Ninety-nine";
            case 98:
                return "Ninety-eight";
            case 97:
                return "Ninety-seven";
            case 96:
                return "Ninety-six";
            case 95:
                return "Ninety-five";
            case 94:
                return "Ninety-four";
            case 93:
                return "Ninety-three";
            case 92:
                return "Ninety-two";
            case 91:
                return "Ninety-one";
            case 90:
                return "Ninety";
            case 89:
                return "Eighty-nine";
            case 88:
                return "Eighty-eight";
            case 87:
                return "Eighty-seven";
            case 86:
                return "Eighty-six";
            case 85:
                return "Eighty-five";
            case 84:
                return "Eighty-four";
            case 83:
                return "Eighty-three";
            case 82:
                return "Eighty-two";
            case 81:
                return "Eighty-one";
            case 80:
                return "Eighty";
            case 79:
                return "Seventy-nine";
            case 78:
                return "Seventy-eight";
            case 77:
                return "Seventy-seven";
            case 76:
                return "Seventy-six";
            case 75:
                return "Seventy-five";
            case 74:
                return "Seventy-four";
            case 73:
                return "Seventy-three";
            case 72:
                return "Seventy-two";
            case 71:
                return "Seventy-one";
            case 70:
                return "Seventy";
            case 69:
                return "Sixty-nine";
            case 68:
                return "Sixty-eight";
            case 67:
                return "Sixty-seven";
            case 66:
                return "Sixty-six";
            case 65:
                return "Sixty-five";
            case 64:
                return "Sixty-four";
            case 63:
                return "Sixty-three";
            case 62:
                return "Sixty-two";
            case 61:
                return "Sixty-one";
            case 60:
                return "Sixty";
            case 59:
                return "Fifty-nine";
            case 58:
                return "Fifty-eight";
            case 57:
                return "Fifty-seven";
            case 56:
                return "Fifty-six";
            case 55:
                return "Fifty-five";
            case 54:
                return "Fifty-four";
            case 53:
                return "Fifty-three";
            case 52:
                return "Fifty-two";
            case 51:
                return "Fifty-one";
            case 50:
                return "Fifty";
            case 49:
                return "Fourty-nine";
            case 48:
                return "Fourty-eight";
            case 47:
                return "Fourty-seven";
            case 46:
                return "Fourty-six";
            case 45:
                return "Fourty-five";
            case 44:
                return "Fourty-four";
            case 43:
                return "Fourty-three";
            case 42:
                return "Fourty-two";
            case 41:
                return "Fourty-one";
            case 40:
                return "Fourty";
            case 39:
                return "Thirty-nine";
            case 38:
                return "Thirty-eight";
            case 37:
                return "Thirty-seven";
            case 36:
                return "Thirty-six";
            case 35:
                return "Thirty-five";
            case 34:
                return "Thirty-four";
            case 33:
                return "Thirty-three";
            case 32:
                return "Thirty-two";
            case 31:
                return "Thirty-one";
            case 30:
                return "Thirty";
            case 29:
                return "Twenty-nine";
            case 28:
                return "Twenty-eight";
            case 27:
                return "Twenty-seven";
            case 26:
                return "Twenty-six";
            case 25:
                return "Twenty-five";
            case 24:
                return "Twenty-four";
            case 23:
                return "Twenty-three";
            case 22:
                return "Twenty-two";
            case 21:
                return "Twenty-one";
            case 20:
                return "Twenty";
            case 19:
                return "Nineteen";
            case 18:
                return "Eighteen";
            case 17:
                return "Seventeen";
            case 16:
                return "Sixteen";
            case 15:
                return "Fifteen";
            case 14:
                return "Fourteen";
            case 13:
                return "Thirteen";
            case 12:
                return "Twelve";
            case 11:
                return "Eleven";
            case 10:
                return "Ten";
            case 9:
                return "Nine";
            case 8:
                return "Eight";
            case 7:
                return "Seven";
            case 6:
                return "Six";
            case 5:
                return "Five";
            case 4:
                return "Four";
            case 3:
                return "Three";
            case 2:
                return "Two";
            case 1:
                return "One";
            case 0:
                return "Zero";
            default:
                System.out.println("Fatal error");
                return "Error";
        }
    }
}
