object interestFun{
    def interest(dipAmt:Int):Double = dipAmt match{
        case dipAmt if dipAmt <= 0 => 0
        case dipAmt if dipAmt <= 1000 => 0.5*dipAmt
        case dipAmt if dipAmt <= 10000 => 0.6*dipAmt
        case dipAmt if dipAmt <= 100000 => 0.7*dipAmt
        case dipAmt if dipAmt > 100000 => 0.8*dipAmt  
    }

    def balance(dipAmt:Int):Double = {
        interest(dipAmt)+dipAmt
    }
}