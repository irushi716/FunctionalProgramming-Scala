object leapYFunc{
    def isLeapY(y:Int):Boolean = ( (y%4==0 && y%100!=0) || (y%400==0) ) match {
        case true => true
        case false => false
    }
}