object evenFunc{
    def isEven(x:Int):String = (x%2) match
        case 0 => "EVEN"
        case _ => "NOT EVEN"   
}