// Ari Gurovich-- Team Consonants -- Eric , Oscar
// APCS pd8
// HW47 -- Guess Again -- using iterative and recursive binary type organizing 
// 2021-12-15
// time spent: 1.5 hrs

/***
 * class GuessNumber -- fun fun fun!
 *
 * SKELETON
 *
 * eg, sample interaction with end user:
 *
 * Guess a # fr 1-100: 50
 * Too high
 * Guess a # fr 1-49: 25
 * Too low
 * Guess a # fr 26-49: 38
 * Correct! It took 3 guesses
 ***/

/***
    DISCO: Binarys kind of easy and really fast
           Divide and set new bounds.
           
    QCC:  Is there a way of doing it that doesnt use so many if statements?
 ***/
import java.util.Scanner;

public class GuessNumber
{

  //instance vars
  private int _lo, _hi, _guessCtr, _target;
  Scanner sc = new Scanner( System.in );


  /*==================================================
    constructor -- initializes a guess-a-number game
    pre:  
    post: _lo is lower bound, _hi is upper bound,
    _guessCtr is 1, _target is random int on range [_lo,_hi]
    ==================================================*/
  public GuessNumber( int a, int b )
  {
    _lo = Math.min(a,b);
    _hi = Math.max(a,b);
    _guessCtr = 0;

    //pick random number in range [a,b]
   _target = (int) (( Math.random() * _hi) + _lo);

  }


  /*==================================================
    void playRec() -- Prompts a user to guess until guess is correct.
    Uses recursion.
    ==================================================*/
  public void playRec()
  {
    System.out.print("Guess a num bt " + _lo + " & " + _hi + ": ");
    int guess = sc.nextInt();

    //3 cases: we either found it, too hi, too lo
   if(guess < _target ){

// if input is higher than bounds, doesnt chnage bounds
        if( _lo > guess){
           System.out.println("WAY too LOW try again");
        }
        else{
           _lo = guess +1;
          System.out.println("too LOW, do it again");
        }

     _guessCtr += 1;
     playRec();
     }

   else if( guess > _target ) {

       if(_hi < guess){
          System.out.println("WAY too HIGH try again");
       }
       else {
          System.out.println( "too HIGH, do it again");
          _hi =guess-1;
       }


     _guessCtr += 1;
     playRec();
     }

   else { 
     System.out.println("U got it !1!1!!");
     System.out.println("Dam that took " + _guessCtr + " guesses?");
     }
  }


  /*==================================================
    void playIter() -- Prompts a user to guess until guess is correct.
    Uses iteration.
    ==================================================*/
  public void playIter()
  {

    int guess;
    boolean x = true;
    while( x = true ) {
      System.out.print("Guess a num bt " + _lo + " & " + _hi + ": ");
      guess = sc.nextInt();

      //3 cases: we either found it, too hi,
    if(guess < _target ){
         if (_lo > _target ){
           System.out.println("WAY too LOW try again"); 
        }
        else{
           _lo = guess +1;
          System.out.println("too LOW, do it again");
        }

     _guessCtr += 1;
     x = true;
     }

   else if( guess > _target ) {

       if(_hi < guess){
          System.out.println("WAY too HIGH try again");
       }
       else {
          System.out.println( "too HIGH, do it again");
          _hi =guess-1;
       }


     _guessCtr += 1;
     x = true;
     }
     else {
     System.out.println("U got it !1!1!!");
     System.out.println("Dam that took " + _guessCtr + " guesses?");
    x = false;
    break; 
    }
  }
}

  //wrapper for playRec/playIter to simplify calling
  public void play()
  {
    //use one or the other below:
   // playRec();
    playIter();
  }


  //main method to run it all
  public static void main( String[] args )
  {
    //instantiate a new game
    GuessNumber g = new GuessNumber(1,100);
    //start the game
    g.play();
/*    -----------------------------*/
  }

}//end class GuessNumber