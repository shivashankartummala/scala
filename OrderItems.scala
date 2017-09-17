import scala.io.Source

object OrderItems {

  def getOrderRevenue(orderId: Int): Double = {
    val orderItems = Source.fromFile("F:\\Trainings\\Hadoop\\data-master\\csv\\retail_db\\order_items\\orderItems").getLines()
    orderItems.
      filter(orderItem => orderItem.split(",")(1).toInt == orderId).
      map(orderItem => orderItem.split(",")(4).toDouble).
      reduce((total, revenue) => total + revenue)
  }

  def main(args: Array[String]) = {
    val orderId: Int = args(0).toInt
    println(getOrderRevenue(orderId))
    println("Program Ends here")
  }

}