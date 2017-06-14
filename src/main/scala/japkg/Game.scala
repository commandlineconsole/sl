package japkg

import scala.collection._
import scala.util.Random

class Game {

  val startingPoint = 1;
  val maxSquare = 100;val winSquare = 100;val minDieRoll = 1;val maxDieRoll = 6

  println("startingPoint = " +startingPoint);  println("maxSquare = " +maxSquare); println("winSquare = " +winSquare); println("minDieRoll = " +minDieRoll); println("maxDieRoll = " +maxDieRoll);

  private var maybeWinner: Option[Token] = None
  println("maybeWinner = " +maybeWinner);

  private val tokensOnBoard = mutable.Map[Token, Int]()   // ("qwqqwqwq,w" , 1)   // ("xxxxx" , 1)

 // println("tokensOnBoard = " +tokensOnBoard);

  def spawnNewToken(name:String): Token = {            // for each time we call this method it will generate new token
    val token = new Token(name)
    moveTo(token, startingPoint)

    println("token = " +token)
    println("token = " +token.name)
    token

  }

  def currentSquare(token: Token): Int = tokensOnBoard(token)

//  println("tokensOnBoard = " +tokensOnBoard)
 // println("currentSquare = " +currentSquare)

  // class Token  - token taken as an object
  def rollDiceFor(token: Token): DiceRoll = DiceRoll(token, randomDieValue())  // generate the randon value btw 1-6

 // println("DiceRoll = " +DiceRoll)

  def moveByDiceRoll(diceRoll: DiceRoll): Unit = {
    //require(maybeWinner.isEmpty, message = "The game has already ended")
    val token = diceRoll.roller
    val square = currentSquare(token) + diceRoll.value
    if (square <= maxSquare) moveTo(token, square)
    if (square == winSquare) maybeWinner = Some(token) // when 100 reached then we stop the game

 //   print("token = " +token); /// println("square = " +square)
  }

  def winner: Option[Token] = maybeWinner  // the winner token is updated for external access
  def winnername: String=   maybeWinner.get.name

  private def moveTo(token: Token, square: Int) = tokensOnBoard += token -> square  // Update the hashmap with the current position for a particular token

  private def randomDieValue(): Int = minDieRoll + Random.nextInt(maxDieRoll - minDieRoll + 1)
  //  1 + (6 -1+1) = 7  ,  nextInt find the next value of the next random value in this case we will get min 8
  // get the random integer val based on the min and max die roll based on the user defined var values) //  self.nextInt(n)

}
