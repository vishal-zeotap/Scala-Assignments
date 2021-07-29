package helloScala2
package Assignment1

object Assignment1 {

  def pascal(c: Int, r: Int): Int = {
    if (c < 0 || r < 0) throw new IllegalArgumentException("Negative Arguments")
    if (c <= 0) return 1
    if (r < c) return 0
    pascal(c, r - 1) + pascal(c - 1, r - 1)
  }

  def balanceHelper(chars: List[Char], value: Int): Boolean = {

    if (chars.isEmpty) {
      if (value == 0) return true
      else return false
    }

    if (value > 0) return false

    if (chars.head == ')')
      return balanceHelper(chars.tail, value + 1)

    if (chars.head == '(')
      return balanceHelper(chars.tail, value - 1)

    balanceHelper(chars.tail, value)
  }

  def balance(chars: List[Char]): Boolean = balanceHelper(chars, 0);

  def countChangeHelper(money: Int, coins: List[Int], sum: Int): Int = {
    if(sum>money)return 0
    if (coins.isEmpty) {if(sum == money) return 1 else return 0}
    if (coins.head < 0) throw new IllegalArgumentException("Negative Arguments")
    countChangeHelper(money, coins, sum + coins.head) + countChangeHelper(money, coins.tail, sum);
  }

  def countChange(money: Int, coins: List[Int]): Int = {
    if (money < 0) throw new IllegalArgumentException("Negative Arguments")
    countChangeHelper(money, coins, 0)
  }

  def main(args: Array[String]): Unit = {
  }
}
