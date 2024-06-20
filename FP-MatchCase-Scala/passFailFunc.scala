object passFailFunc{
    def passfail(marks:Int):String = (marks>=50) match{    
        case true => "PASS"
        case false => "FAIL"
    }
}