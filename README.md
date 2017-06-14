"# sl" 
```
Snakes and Ladders Kata

User defined variables
----------------------
startingPoint = 1
maxSquare = 100
winSquare = 100
minDieRoll = 1
maxDieRoll = 6
maybeWinner = None

Following Tokens are invoked for the users.
-------------------------
token = japkg.Token@42d3bd8b
token = raj

token = japkg.Token@26ba2a48
token = ravi

token = japkg.Token@5f2050f6
token = ja

Dice new current position
----------------------------
4:raj - 2:ravi - 2:ja
9:raj - 4:ravi - 7:ja
14:raj - 7:ravi - 9:ja
20:raj - 13:ravi - 13:ja
25:raj - 16:ravi - 15:ja
28:raj - 19:ravi - 21:ja
34:raj - 21:ravi - 25:ja
37:raj - 25:ravi - 29:ja
40:raj - 29:ravi - 34:ja
41:raj - 30:ravi - 35:ja
45:raj - 36:ravi - 38:ja
47:raj - 38:ravi - 44:ja
52:raj - 44:ravi - 45:ja
55:raj - 46:ravi - 51:ja
57:raj - 51:ravi - 55:ja
62:raj - 54:ravi - 59:ja
67:raj - 56:ravi - 65:ja
70:raj - 57:ravi - 66:ja
72:raj - 59:ravi - 69:ja
76:raj - 64:ravi - 70:ja
81:raj - 69:ravi - 72:ja
82:raj - 75:ravi - 73:ja
83:raj - 81:ravi - 77:ja
84:raj - 85:ravi - 78:ja
89:raj - 89:ravi - 81:ja
90:raj - 91:ravi - 83:ja
95:raj - 96:ravi - 88:ja
98:raj - 99:ravi - 94:ja
98:raj - 99:ravi - 95:ja
98:raj - 99:ravi - 100:ja
Winner = ja

Process finished with exit code 0
```
```
Notes:
------
Step 1: Define Token as an Object in Token.scala
Step 2: Define DiceRoll object to invoke the Token as key and value pairs, values are retrieved based on the random values from randomDieValue method
Step 3: spawnNewToken, moveTo method will get the dice new position based on the new token and starting point

```