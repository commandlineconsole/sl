package japkg

/**
  * Created by Ja on 13/06/2017.
  */


object TestMe {
  def main(args: Array[String]): Unit = {
    val g : Game = new Game()
    val token =  g.spawnNewToken("raj")   // user 1
    val token1 =  g.spawnNewToken("ravi")   // user 2
    val token2 =  g.spawnNewToken("ja")   // user 3

// loop thr until winner found
    while(g.winner == None ) {

       g.moveByDiceRoll(g.rollDiceFor(token))

       g.moveByDiceRoll(g.rollDiceFor(token1))

       g.moveByDiceRoll(g.rollDiceFor(token2))

      println(g.currentSquare(token) + ":" + token.name + " - " + g.currentSquare(token1) +":" + token1.name + " - "  + g.currentSquare(token2)+":" + token2.name )

    }


   // if (v1 == 100) {println("Winner is A")}
    println("Winner = " + g.winnername)



  }

}

/*
  // class Token  - token taken as an object
  def rollDiceFor(token: Token): DiceRoll = DiceRoll(token, randomDieValue())  // case class DiceRoll(roller: Token, value: Int)

def spawnNewToken(): Token = {
  val token = new Token
  moveTo(token, startingPoint)
  token
}
*/
