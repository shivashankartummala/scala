case class Order( var orderId: Int,
             var orderDate: String,
             var orderCustomerId: Int,
             var orderStatus: String
           )

object Order {

   def main(args: Array[String]): Unit ={
     val o1 = new Order(1,"2017-12-25",101,"COMPLETE")
     println(o1)

   }


}
