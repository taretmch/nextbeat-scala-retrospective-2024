//> using scala 3.4.2

enum Color:
  case Red, Green, Blue

def getEmojiNotGood(color: Color): String = color match
  case Color.Red => "🔴"
  case Color.Green => "🟢"
  case _ => "🔵"

def getEmojiGood(color: Color): String = color match
  case Color.Red => "🔴"
  case Color.Green => "🟢"
  case Color.Blue => "🔵"

println(getEmojiNotGood(Color.Red))
println(getEmojiGood(Color.Blue))
