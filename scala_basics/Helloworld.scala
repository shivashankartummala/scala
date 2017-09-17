import scala.io.Source

object Helloworld {

  def main(args: Array[String]) = {
    println("Hello " + args(0))
    val orders = Source.fromFile("F:\\Trainings\\Hadoop\\data-master\\csv\\retail_db\\orders\\orders").getLines
    orders.map(order => order.split(",")(3)).toSet.foreach(println)
  }

}
