object t1 {

enum Option[+T] {
  case Some[T](x: T)
  case None
}

}

object t2 {

enum Option[+T] {
  case Some[T](x: T) extends Option[T]
  case None          extends Option[Nothing]
}


}

enum Color(val rgb: Int) {
  case Red   extends Color(0xFF0000)
  case Green extends Color(0x00FF00)
  case Blue  extends Color(0x0000FF)
  case Mix(mix: Int) extends Color(mix)
}

object t3 {

enum class Option[+T] {
   def isDefined: Boolean
}
object Option {
  def apply[T >: Null](x: T): Option[T] =
    if (x == null) None else Some(x)

  case Some[+T](x: T) {
     def isDefined = true
  }
  case None {
     def isDefined = false
  }
}

}
