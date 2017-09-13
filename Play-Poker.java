/*************************************************************************************
 *
 *  Requires:  PlayingCard.java and VideoPoker.java
 *
 * Implement poker game program: 
 *
 * 	Part I (30%)  Implement Deck class
 * 	Part II (70%) Implement VideoPoker class
 *
 * See PlayingCard.java and VideoPoker.java for more instruction 
 *
 * PJ3 class allows user to run program as follows:
 *
 *    	java Play-Poker		    // default credit is $100
 *  or 	java Play-Poker NNN		// set initial credit to NNN
 *
 * 
 *
 *************************************************************************************/

class PJ3 {

    public static void main(String args[]) 
    {
	VideoPoker mypokergame;
	if (args.length > 0)
		mypokergame = new VideoPoker(Integer.parseInt(args[0]));
	else
		mypokergame = new VideoPoker();
	mypokergame.play();
    }
}
