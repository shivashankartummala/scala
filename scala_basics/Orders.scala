class Orders(var orderId: Int,
             var orderDate: String,
             var orderCustomerId: Int,
             var orderStatus: String) {
  override def toString: String = {
    "Orders(" + orderId + ", " + orderDate + ", " + orderCustomerId + ", " + orderStatus + ")"
  }
}

object Orders {
  def apply(orderId: Int,
            orderDate: String,
            orderCustomerId: Int,
            orderStatus: String): Orders= {
    new Orders(orderId, orderDate, orderCustomerId, orderStatus)
  }
}